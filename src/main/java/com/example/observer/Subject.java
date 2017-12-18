package com.example.observer;

/**
 * Created by chenlu on 2017/12/18.
 */
public interface Subject {
    /**
     * 增加订阅者
     */
    public void attach(Observer observer);

    /**
     * 删除订阅者
     */
    public void delete(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);
}
