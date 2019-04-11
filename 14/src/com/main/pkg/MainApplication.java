package com.main.pkg;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Student student = context.getBean("student", Student.class);
		Student student1 = context.getBean("student", Student.class);
		
		System.out.println(student.toString());

		System.out.println(student1.toString());
		
	}
}
