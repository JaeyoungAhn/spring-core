package com.spring.springdemo;

import org.springframework.stereotype.Component;

// @Component 
// for default Bean ID
// which will be tennisCoach

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
