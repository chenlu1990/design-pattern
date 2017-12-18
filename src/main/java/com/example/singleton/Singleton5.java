package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * 静态内部类单例模式：
 * 既能实现延时加载，又能保证线程安全
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class SingletonHolder {
        private static Singleton5 instance = new Singleton5();

    }

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }
}
