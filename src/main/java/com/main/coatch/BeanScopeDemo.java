package com.main.coatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("springBean.xml");
		Coatch coatch = container.getBean("BaseBall", Coatch.class);
		Coatch coatch2 = container.getBean("BaseBall", Coatch.class);
		System.out.println(coatch==coatch2);	
	  //coatch.workout(); System.out.println(coatch.getDailyFortune());		 
	}

}
