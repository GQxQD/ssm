package cn.gqxqd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.gqxqd.service.IUserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IUserService userService = (IUserService) ctx.getBean("userService");
		userService.addUser();
	}
}
