package com.example.adapter;

/**
 * Created by chenlu on 2017/12/18.
 */

/**
 * 2、对象适配器模式(常用)：持有src类，实现dst接口，完成src-dst的适配
 * （根据“合成复用原则”，在系统中尽量使用关联关系替代继承关系，因此大部分结构型模式都是对象结构型模式）
 */
public class VoltageAdapter2 implements Voltage5 {
    private Voltage220 voltage220;

    public VoltageAdapter2(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220) {
            int src = voltage220.output220V();
            System.out.println("对象适配工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }
}
