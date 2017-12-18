package com.example.adapter;

/**
 * Created by chenlu on 2017/12/18.
 */

/**
 * client类：手机需要5V电压
 */
public class Mobile {
    public static void charging(Voltage5 voltage5) {
        if (voltage5.output5V() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5V() > 5) {
            System.out.println("电压超过5V.....");
        }
    }

    public static void main(String[] args) {
        System.out.println("===========类适配器=========");
        //Mobile.charging(new VoltageAdapter());//类适配器模式
        Mobile.charging(new VoltageAdapter2(new Voltage220()));//对象适配器模式

    }
}
