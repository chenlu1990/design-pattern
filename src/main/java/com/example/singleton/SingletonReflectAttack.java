package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式被java反射攻击
 */
public class SingletonReflectAttack {
    public static void attack() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> classType = Singleton.class;
        Constructor<?> constructor = classType.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Singleton singleton = (Singleton) constructor.newInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }

    public static void modifiedByAttack() {
        try {
            Class<SingletonNotAttackByReflect> classType = SingletonNotAttackByReflect.class;
            Constructor<SingletonNotAttackByReflect> constructor = classType.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            SingletonNotAttackByReflect singleton = (SingletonNotAttackByReflect) constructor.newInstance();
            SingletonNotAttackByReflect singleton2 = SingletonNotAttackByReflect.getInstance();

            System.out.println(singleton == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("------饿汉单例模式被java反射攻击测试-------");
        //SingletonReflectAttack.attack();
        SingletonReflectAttack.modifiedByAttack();
        System.out.println("----end----");
    }
}
