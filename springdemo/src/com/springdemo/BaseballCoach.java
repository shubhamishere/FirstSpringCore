package com.springdemo;

public class BaseballCoach implements Coach {
	
	//Define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "do baseball practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use myFortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
