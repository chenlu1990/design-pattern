package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

/**
 * 枚举实现线程安全的单例模式
 * 特点：JVM会保证enum不能被反射并且构造器方法只执行一次
 */
public class Singleton6 {
    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        return Single.INSTANCE.getInstance();
    }

    private static enum Single {
        INSTANCE;
        private Singleton6 single;

        private Single() {
            single = new Singleton6();
        }

        public Singleton6 getInstance() {
            return single;
        }
    }

    public static void main(String[] args) {
        Singleton6 s = Singleton6.getInstance();
        Singleton6 s1 = Singleton6.getInstance();
        System.out.println(s == s1);
    }
}
