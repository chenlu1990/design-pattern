package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * Cglib采用了非常底层的字节码技术，其原理是通过字节码技术为类创建一个子类，并在子类中采用方法拦截
 * 的技术拦截所有父类方法的调用，顺势织入横切逻辑。
 */
public class CglibBlogFactory implements MethodInterceptor {

    private Object target;

    public CglibBlogFactory(IBlogService target){
        this.target = target;
    }

    public Object getProxyInstance(){
        //1、工具类
        Enhancer en = new Enhancer();
        //2、设置父类
        en.setSuperclass(target.getClass());
        //3、设置回调函数
        en.setCallback(this);
        //4、创建子类（代理对象）
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start writing...");
        //执行目标对象方法
        Object returnValue = method.invoke(target,objects);
        System.out.println("end writing...");
        return returnValue;
    }
}
