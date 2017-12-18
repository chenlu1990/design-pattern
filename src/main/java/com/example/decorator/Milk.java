package com.example.decorator;

/**
 * Created by chenlu on 2017/12/18.
 */
public class Milk extends Decorator {
    private String description = "加了牛奶!";
    private Beverage beverage = null;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " \n" + description;
    }

    public double getPrice() {
        return beverage.getPrice() + 20;
    }
}

/**
 * 装饰模式又名包装模式。装饰模式以客户端透明的方式扩展对象的功能，是继承关系的一个替代方案。
 * 用于不改变接口的前提下，增强所考虑的类的性能（动态的给一个对象添加一些额外的职责）
 * 角色组成：
 * 抽象构件：给出一个抽象接口，以规范准备接收附加责任的对象
 * 具体构件：定义一个将要接收附加责任的类
 * 装饰角色：持有一个构件对象的实例，并定义一个与构件接口一致的接口
 * 具体装饰角色：负责给构件对象“贴上”附加的责任
 *
 * 优点：
 * 1、装饰模式与继承关系的目的都是要扩展对象的功能，但是装饰模式可以提供比继承更多的灵活性。
 * 装饰模式允许系统动态决定“贴上”一个需要的装饰或者出掉一个不需要的装饰。继承关系则不同，
 * 继承关系是静态的，它在系统运行前就决定了。
 * 2、通过使用不同的具体装饰类及这些装饰类的排列组合，可以创造出很多不同行为的组合。
 * 缺点：
 * 使用装饰模式会产生比使用继承关系更多的对象。更多的对象会使得查错变的困难。
 */
