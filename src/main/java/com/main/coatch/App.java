package com.main.coatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		BaseBall bs= container.getBean("BaseBall",BaseBall.class);
		bs.workout();
		System.out.println(bs.getDailyFortune());
	}

}
