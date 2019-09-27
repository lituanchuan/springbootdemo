package com.qf.springboot1905.springboot_01;

import com.qf.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot01ApplicationTests {

	@Autowired
	private User user;

	@Value("${user.name}")
	private  String name;
	@Test
	public void testBean() {
		System.out.println(user);
		System.out.println(name);
	}

}
