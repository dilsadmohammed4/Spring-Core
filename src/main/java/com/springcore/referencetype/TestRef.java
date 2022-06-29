package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.Student;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/referencetype/refconfig.xml");
		A a = (A) context.getBean("a1");
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		System.out.println(a);
	}

}
