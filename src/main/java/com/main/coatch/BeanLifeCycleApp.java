package com.main.coatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("springBeanLifeCylcle.xml");
		Coatch coatch = container.getBean("BaseBall", Coatch.class);
		coatch.workout();
		container.close();
	}

}
