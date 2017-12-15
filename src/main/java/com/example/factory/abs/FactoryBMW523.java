package com.example.factory.abs;

/**
 * Created by chenlu on 2017/12/15.
 */
public class FactoryBMW523 implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
