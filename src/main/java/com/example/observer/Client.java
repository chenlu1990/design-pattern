package com.example.observer;

/**
 * Created by chenlu on 2017/12/18.
 */
public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUser user1 = new WeixinUser("张三");
        WeixinUser user2 = new WeixinUser("李四");
        WeixinUser user3 = new WeixinUser("王五");
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);
        subscriptionSubject.delete(user1);
        subscriptionSubject.notify("xxx的专栏更新了！");
    }
    /**
     * 观察者模式（又被称为发布-订阅模式），属于行为型模式的一种，它定义了一种一对多的依赖关系，
     * 让多个观察者对象同时监听某一个主题对象。这个主题对象在状态变化时，会通知所有的观察者对象，
     * 使他们能够自动更新自己
     *
     * 观察者模式中的角色：
     * subject:抽象主题（抽象被观察者），抽象主题角色把所有被观察者对象保存在一个集合里，每个主题
     * 都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象
     * concrecteSubject:具体的主题（具体的被观察者），该角色将有关状态存入具体的观察者对象，在具体主题
     * 内部发生改变时，给所有注册过的观察者发通知
     * observer：抽象观察者，它定义了一个更新接口，使得在得到主题更改通知时更新自己
     * ConcrereObserver：具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更新通知时更新自身状态。
     *
     * 优点：
     * 解除耦合，让耦合的双方都依赖于抽象，从而使得各自的变换都不会影响另一边的变换
     * 缺点：
     * 在应用观察者模式时需要考虑一下开发效率和运行效率的问题，程序中包括一个被观察者、多个观察者，
     * 开发、调试等内容会比较复杂，而且在Java中消息的通知一般是顺序执行，那么一个观察者卡顿，会影响整体的执行效率，
     * 在这种情况下，一般会采用异步实现。
     */
}
