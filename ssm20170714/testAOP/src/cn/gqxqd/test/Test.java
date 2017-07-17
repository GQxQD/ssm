package cn.gqxqd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.gqxqd.entity.User;
import cn.gqxqd.service.IUserService;

public class Test {
	public static void main(String[] args) throws Exception {
		// IUserService userService = MyBeanFactory.createService();
		// User user = new User();
		// user.setUsername("ÕÅÈý");
		// user.setPassword("123");
		// Set<String> hobbies=new HashSet<String>();
		// hobbies.add("Ìß×ãÇò");
		// user.setHobbies(hobbies);
		// userService.addUser(user);

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// UserServiceImpl proxyFactoryBean = (UserServiceImpl)
		// context.getBean("proxyService");
		IUserService userService = (IUserService) context
				.getBean("userService");
		User user = (User) context.getBean("user");
		userService.addUser(user);

		// IUserService userService = (IUserService) context
		// .getBean("userService");
		// userService.addUser(user);
		// userService.deleteUser(user);
		// userService.updateUser(user);
		// System.out.println(user.getHobbies().getClass().getName());
		// User libai = (User) context.getBean("libai");
		// User libai2 = (User) context.getBean("libai");
		// System.out.println(libai);
		// System.out.println(libai2);
		// User luo = (User) context.getBean("luo");
		// libai.say();
		// luo.say();
	}
}
