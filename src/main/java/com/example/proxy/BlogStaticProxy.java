package com.example.proxy;

/**
 * Created by chenlu on 2017/12/14.
 */
public class BlogStaticProxy implements IBlogService {
    private IBlogService blogService;

    public BlogStaticProxy(IBlogService blogService){
        this.blogService = blogService;
    }
    @Override
    public void writeBLog() {
        System.out.println("start writing...");
        blogService.writeBLog();
        System.out.println("end writing...");
    }
}
