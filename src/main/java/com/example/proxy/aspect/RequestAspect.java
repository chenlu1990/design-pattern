package com.example.proxy.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chenlu on 2017/12/14.
 */
@Component
@Aspect
public class RequestAspect {
    private static final Logger INTERFACE_TIMEOUT_LOG = LoggerFactory.getLogger("INTERFACE_TIMEOUT_LOG");

    /**
     * execution(modifier-pattern? ret-type-pattern declaring-type-pattern?  name-pattern(param-pattern)
     * throws-pattern?) pattern分别表示修饰符匹配（modifier-pattern?）、 返回值匹配（ret-type-pattern）、 类路径匹配（declaring-type-pattern?）、
     * 方法名匹配（name-pattern）、 参数匹配（(param-pattern)）、 异常类型匹配（throws-pattern?）， 其中后面跟着“?”的是可选项。
     */
    @Around(value = "execution(* com.example.proxy.aspect..*.*(..)) && @annotation(InterfaceProperty)")
    public Object validate(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        String methodName = pjp.getTarget().getClass().getName() + "." + pjp.getSignature().getName();
        System.out.println("方法名methodName::" + methodName);
        long start = System.currentTimeMillis();
        Object obj = null;
        try {
            obj = pjp.proceed(args);
            long end = System.currentTimeMillis();
            long useTime = end - start;
            interfaceUseTimerMonitor(pjp.getTarget().getClass(), pjp.getSignature().getName(), args, useTime);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("--obj--:"+obj);
        return obj;
    }

    public void interfaceUseTimerMonitor(Class targetClass, String methodName, Object[] args, long useTime) {
        Class[] classArray = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            classArray[i] = args[i].getClass();
            System.out.println("class::" + classArray[i]);
        }
        System.out.println("methodName::" + methodName);
        try {
            Method method = targetClass.getMethod(methodName, classArray);
            if (method.isAnnotationPresent(InterfaceProperty.class)) {
                InterfaceProperty interfaceProperty = method.getAnnotation(InterfaceProperty.class);
                if (useTime > interfaceProperty.outTime()) {
                    if (INTERFACE_TIMEOUT_LOG.isInfoEnabled()) {
                        INTERFACE_TIMEOUT_LOG.info("接口超时：interface[{}].useTime[{}].traceId[{}]",
                                new Object[]{targetClass.getSimpleName() + "." + methodName,
                                        useTime,
                                        interfaceProperty.outTime()});
                    }
                }
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
