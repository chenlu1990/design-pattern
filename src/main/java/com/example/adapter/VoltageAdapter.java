package com.example.adapter;

/**
 * Created by chenlu on 2017/12/18.
 */

/**
 * 1、类适配器模式:Adapter类，通过继承 src类，实现 dst 类接口，完成src->dst的适配
 * 适配器类：完成220V-5V的转变
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配器完成输出的电压：" + dst);
        return dst;
    }
}
