package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ColTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/colconfig.xml");
		Emp empOne = (Emp) context.getBean("emp1");
		System.out.println(empOne.getName());
		System.out.println(empOne.getPhones());
		System.out.println(empOne.getAddress());
		System.out.println(empOne.getCourses());
		System.out.println(empOne.getCountryAndLangs());
	}

}
