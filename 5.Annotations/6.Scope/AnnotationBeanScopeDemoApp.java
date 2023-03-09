package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same boject: " + result);
		// true if singleton
		// false if prototype
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		//@8297b3a if singleton
		//@43c1b556 if prototype
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		//@8297b3a if singleton
		//@587e5365 if prototype
		
		// close the context
		context.close();


	}

}
