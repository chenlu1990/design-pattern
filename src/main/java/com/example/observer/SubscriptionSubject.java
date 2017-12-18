package com.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenlu on 2017/12/18.
 */
public class SubscriptionSubject implements Subject {

    private List<Observer> weixinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserList) {
            observer.update(message);
        }
    }
}
