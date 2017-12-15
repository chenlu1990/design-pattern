package com.example.singleton;

/**
 * Created by chenlu on 2017/12/14.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 登记线程模式，线程安全
 * 就是将该类名登记，每次调用前查询，如果存在直接使用；不存在，则进行登记
 */
public class Singleton4 {
    private static Map<String, Singleton4> map = new HashMap<>();

    protected Singleton4() {

    }

    static {
        Singleton4 singleton4 = new Singleton4();
        map.put(singleton4.getClass().getName(), singleton4);
    }

    public static Singleton4 getInstance(String name) {
        if (name == null) {
            name = Singleton4.class.getName();
            System.out.println("name==null ---> name=" + name);
        }
        if (null == map.get(name)) {
            try {
                map.put(name, (Singleton4) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
