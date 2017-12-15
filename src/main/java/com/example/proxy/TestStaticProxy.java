package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */
//静态代理，在不修改目标对象的前提下，可以通过代理对象做额外的扩展功能。
//但静态方法不是很灵活，如果目标代码修改，目标对象和代理对象都需要修改。
public class TestStaticProxy {
    public static void main(String[] args) {
        IBlogService blogService = new BlogService();
        BlogStaticProxy blogStaticProxy = new BlogStaticProxy(blogService);
        blogStaticProxy.writeBLog();
    }
}
