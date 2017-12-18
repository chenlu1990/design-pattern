package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class Decorator implements Beverage {

    private String description = "我只是装饰器，不知道具体的描述";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
