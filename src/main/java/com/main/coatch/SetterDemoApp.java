package com.main.coatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext container =new ClassPathXmlApplicationContext("Spring.xml");
	CricketCoach bscoach = container.getBean("cricketcoach",CricketCoach.class);
	bscoach.workout();
	System.out.println(bscoach.getDailyFortune());
	System.out.println(bscoach.getTeam()+bscoach.getEmail());
	  
	}

}
