package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student studentOne = (Student) context.getBean("student1");
		Student studentTwo = (Student) context.getBean("student2");
		System.out.println(studentOne);
		System.out.println(studentTwo);
		Student studentThree = (Student) context.getBean("student3");
		System.out.println(studentThree);

	}
}
