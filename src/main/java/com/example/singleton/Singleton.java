package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * 单例模式：
 * 1、单例类只能有一个实例
 * 2、单例类必须自己创建自己的实例
 * 3、单例类必须给其他所有对象提供这个实例
 */
public class Singleton {
    /**
     * 饿汉式单例模式：
     * 特点：可以通过反射工具，线程安全
     */
    private static final Singleton INSTANCE = new Singleton();

    private static boolean flag = true;

    private Singleton() {

    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
