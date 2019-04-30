package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("practiceBeanScope-applicationContext.xml");
		
		//retrieve bean from spring container (context)
		Coach theGolfCoach = context.getBean("myGolfCoach", Coach.class);
		
		//do your desired work
		System.out.println(theGolfCoach.getDailyWorkout());
		System.out.println(theGolfCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
