package com.example.factory.method;

/**
 * Created by chenlu on 2017/12/15.
 */
public class Square implements Shape {

    public Square(){
        System.out.println("创建方形模型");
    }

    @Override
    public void draw() {
        System.out.println("画了一个方形");
    }
}
