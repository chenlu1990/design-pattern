package com.example.factory.method;

/**
 * Created by chenlu on 2017/12/15.
 */
public class CircleFactory implements Factory {
    @Override
    public Shape createShape() {
        Shape shape = new Circle();
        return shape;
    }
}
