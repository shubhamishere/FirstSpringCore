package com.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService{
	
	private String randomLuck[] = {"You are lucky today", "Feeling super lucky", "feeling good"};
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(randomLuck.length);
		String fortune = randomLuck[index];
		return fortune;
	}

}
