package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * 懒汉式单例模式：延时加载，线程不安全
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    /*public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }*/
    //加同步锁，线程安全
    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 s = Singleton2.getInstance();
        Singleton2 s1 = Singleton2.getInstance();
        System.out.println(s == s1);
    }
}
