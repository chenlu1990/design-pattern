package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */

public class TestJdkProxy {
    public static void main(String[] args) {
        IBlogService target = new BlogService();
        System.out.println(target.getClass());
        //给目标对象创建代理对象
        IBlogService proxy = (IBlogService) new JdkBlogProxyFactory(target).newInstance();
        System.out.println(proxy.getClass());
        proxy.writeBLog();

    }
}
