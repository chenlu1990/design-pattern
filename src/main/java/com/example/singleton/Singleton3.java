package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * 双重校验，线程安全
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    //禁止指令重排优化
    //private static volatile Singleton3 instance = null;

    public static Singleton3 getInstance(){
        if(instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
