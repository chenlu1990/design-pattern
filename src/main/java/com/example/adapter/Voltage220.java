package com.example.adapter;

/**
 * Created by chenlu on 2017/12/18.
 */

/**
 * src类(被适配的类)：220V的电压
 */
public class Voltage220 {
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}
