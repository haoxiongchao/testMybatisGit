package sy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.model.User;
import sy.service.UserService;

public class TestMyBatis {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"spring.xml","spring-mybatis.xml"});
		UserService userService = (UserService) ac.getBean("userService");
		User u = userService.gerUserById("1");
		System.out.println(u);
	}
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"spring.xml","spring-mybatis.xml"});
		UserService userService = (UserService) ac.getBean("userService");
		User u = userService.gerUserById("3");
		System.out.println(u.getName());
	}
}

