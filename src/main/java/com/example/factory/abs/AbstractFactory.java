package com.example.factory.abs;

/**
 * Created by chenlu on 2017/12/15.
 */
public interface AbstractFactory {
    //制造发动机
    Engine createEngine();
    //制造空调
    Aircondition createAircondition();
}
