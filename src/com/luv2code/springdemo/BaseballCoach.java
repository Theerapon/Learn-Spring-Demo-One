package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spen 30 minutes on batting practice";
	}

	@Override
	public String getDailyForture() {
		// TODO Auto-generated method stub
		return fortuneService.getForture();
	}

}
