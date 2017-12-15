package com.example.factory.simple;

/**
 * Created by chenlu on 2017/12/15.
 */

/**
 * 简单工厂模式又称静态工厂方法模式，用来定义一个用于创建对象的接口。
 * 工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑
 * 抽象产品：它一般是具体产品继承的父类或者实现的接口
 * 具体产品角色：工厂类所创建的对象就是此角色的实例。
 *
 * 使用场景：创建简单，无复杂业务逻辑的场合
 * 缺点：存在耦合，违反了开闭原则
 */
public class SimpleFactory {
    private final static String CIRCLE = "CIRCLE";

    private final static String SQUARE = "SQUARE";


    public static Shape getShape(String type){
        switch(type){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                throw new NullPointerException("未描述任何图形");
        }
    }
    //使用反射机制可以解决每次增加一个产品，都需要创建一个对象的逻辑的缺点
    public static Object getShape(Class<?extends Shape> clazz){
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        Shape circle = SimpleFactory.getShape("CIRCLE");
        circle.draw();
        Square square = (Square)SimpleFactory.getShape(Square.class);
        square.draw();
    }
}
