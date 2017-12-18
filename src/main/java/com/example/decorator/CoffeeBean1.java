package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class CoffeeBean1 implements Beverage {
    private String description = "选择了第一种咖啡";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
