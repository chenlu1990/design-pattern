package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class CoffeeBean2 implements Beverage {
    private String description = "第二种咖啡豆";

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
