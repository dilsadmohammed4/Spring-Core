package com.springcore.javatautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/javatautowiring/appContext.xml");
		A a = context.getBean("a", A.class);
		a.display();

	}

}
