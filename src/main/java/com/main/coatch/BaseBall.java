package com.main.coatch;

public class BaseBall implements Coatch{
	private FortuneService fortunService;
	
	public BaseBall(FortuneService fortunService) {
		this.fortunService = fortunService;
	}

	@Override
	public void workout() {
		System.out.println("Daily 2 hours");
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortunService.getFortune();
	}
	public void doMyStarting() {
		System.out.println("method starting");
	}
	public void doMyCleanUp() {
		System.out.println("destroying");
	}

}
