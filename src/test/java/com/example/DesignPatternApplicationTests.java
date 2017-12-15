package com.example;

import javax.annotation.Resource;

import com.example.proxy.aspect.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternApplicationTests {

	@Resource
	private UserService userService;

	@Test
	public void contextLoads() {
		userService.add(1,"小红");
		//userService.delete(1);
	}

}
