package com.example.factory.method;

/**
 * Created by chenlu on 2017/12/15.
 */

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
 * 抽象工厂：是工厂方法模式的核心，与应用程序无关。
 * 具体工厂：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建产品对象
 * 抽象产品：工厂方法模式所创建的对象的超类型，也是产品对象的共同父类/接口
 * 具体产品：实现了抽象产品定义的所有接口
 *
 * 工厂方法和简单工厂的区别：
 * 工厂方法模式把简单工厂的内部逻辑判断移到了客户端代码来进行
 * 工厂方法模式是简单工厂模式的衍生，首先实现了开放-封闭的原则，实现了可扩展。其次更复杂的层次结构，可以应用于
 * 产品结果复杂的场合
 *
 * 优点：
 * 1、屏蔽了客户端实例化对象的细节，用户只需关心自己使用的工厂即可
 * 2、加入新产品，无需更改现有代码，提高了系统的扩展性，符合开闭原则
 * 3、具备多态性
 * 缺点：
 * 每次需要编写新的对象和对象工厂类，随着业务的发展，一定程度上增加了系统的复杂度
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Factory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();
        System.out.println("---------");
        Factory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
    }
}
