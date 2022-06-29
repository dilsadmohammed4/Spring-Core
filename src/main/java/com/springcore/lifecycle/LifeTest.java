package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifeconfig.xml");
		Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);
		/* Registring Shutdown Hook. It call Destroy method */
		context.registerShutdownHook();

		System.out.println("===============");
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);

		System.out.println("*************");
		Example e = (Example) context.getBean("e1");
		System.out.println(e);

	}

}
