package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	//Define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach () {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Do your daily exercise!";
	}
	public String getDailyFortune() {
		
		return "Just do it: " + fortuneService.getFortune();
	}
	public void doStartup() {
		System.out.println("take off!");
	}
	public void doCleanup() {
		System.out.println("shutting down.");
	}
}

