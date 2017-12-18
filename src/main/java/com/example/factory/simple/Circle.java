package com.example.factory.simple;

/**
 * Created by chenlu on 2017/12/15.
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("创建圆形模型");
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆形");
    }
}
