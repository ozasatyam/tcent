package com.main.coatch;

public class CricketCoach implements Coatch {
	private FortuneService fortuneservice;
	private String email;
	private String team;

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public void workout() {
		System.out.println("practice fast balling 50minutes a day");
	}

	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	public CricketCoach() {
		System.out.println("Cricket insde constructor");
	}

	@Override
	public String getDailyFortune() {

		return fortuneservice.getFortune();
	}

}
