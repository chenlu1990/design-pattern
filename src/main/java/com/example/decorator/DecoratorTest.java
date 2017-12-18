package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Beverage beverage = new CoffeeBean1();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + "\n加了摩卡和牛奶的咖啡价格：" + beverage.getPrice());
    }
}
