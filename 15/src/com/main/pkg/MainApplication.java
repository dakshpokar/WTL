package com.main.pkg;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		CricketCoach tendulkar = context.getBean("ccoach", CricketCoach.class);
		BaseballCoach ramesh = context.getBean("bcoach", BaseballCoach.class);
		
		System.out.println(tendulkar.getDailyWorkout());
		System.out.println(ramesh.getDailyWorkout());
		
	}
}
