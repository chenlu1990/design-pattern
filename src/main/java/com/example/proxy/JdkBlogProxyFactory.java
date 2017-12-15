package com.example.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * jdk动态代理由Proxy这个类来生成，它有三个参数：
 * ClassLoader loader：指定当前目标对象使用的类加载器，获取类加载器的方法是固定的
 * Class[?] interfaces：目标对象实现的接口类型，使用泛型方式确认类型
 * InvocationHandler h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，会
 * 把当前执行目标对象的方法作为参数传入
 */
public class JdkBlogProxyFactory {
    private Object target;

    public JdkBlogProxyFactory(Object target){
        this.target= target;
    }
    public Object newInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                ((proxy, method, args) -> {
                    System.out.println("start writing...");
                    Object o = method.invoke(target,args);
                    System.out.println("end writing...");
                    return  o;
                }));
    }
}
