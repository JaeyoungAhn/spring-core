package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		// true if singleton
		// false if prototype
		System.out.println("\nMemory location for theCoach: " + theCoach);
		// 5e853265 if singleton
		// 2a17b7b6 if prototype

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		// 5e853265 which is the same as the previous one if singleton
		// 4f063c0a if prototype which is not the same as the previous one

		// close the context
		context.close();
		
	}
}
