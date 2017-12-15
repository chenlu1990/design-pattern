package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        IBlogService target = new BlogService();
        System.out.println(target.getClass());
        //代理对象
        IBlogService proxy = (IBlogService) new CglibBlogFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        //执行代理对象方法
        proxy.writeBLog();
    }
}
