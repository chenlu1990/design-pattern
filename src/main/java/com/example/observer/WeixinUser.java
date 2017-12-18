package com.example.observer;

/**
 * Created by chenlu on 2017/12/18.
 */
public class WeixinUser implements Observer {

    private String name;//微信用户名

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " -- " + message);
    }
}
