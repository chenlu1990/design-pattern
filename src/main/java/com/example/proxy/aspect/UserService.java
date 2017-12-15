package com.example.proxy.aspect;

import org.springframework.stereotype.Service;

/**
 * Created by chenlu on 2017/12/14.
 */
@Service
public class UserService {
    @InterfaceProperty
    public void add(Integer id, String name) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("添加了一个新用户[id:" + id + ",name:" + name + "]");
    }

    public void delete(Integer id) {
        System.out.println("删除了id为" + id + "的用户");
    }
}

