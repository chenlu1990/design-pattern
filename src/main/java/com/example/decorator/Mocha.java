package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class Mocha extends Decorator {
    private String description = "加了摩卡！";

    private Beverage beverage = null;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "\n" + description;
    }

    public double getPrice() {
        return beverage.getPrice() + 49;//49表示摩卡的价格；
    }
}
