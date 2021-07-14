package com.main.tcent;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		  vehicle v1 = (vehicle)context.getBean("car"); 
		  v1.drive();
		 
	}

}
 