package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */
public class BlogService implements IBlogService {
    @Override
    public void writeBLog() {
        System.out.println("I'm writing......");
    }
}
