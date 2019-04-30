package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on a bean
		System.out.println(theCoach.getDailyWorkout());
		
		//calling new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
