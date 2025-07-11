package com.nit.sj.sbeans;

import java.time.LocalTime;

public class WIshMessageGenerator {
	
	// Has A property 
	private LocalTime time ;
	
	public WIshMessageGenerator() {
		System.out.println("WIshMessageGenerator.WIshMessageGenerator()");
	}
	
	// Setter Method For Setter Injection 
	public void setTime(LocalTime time) {
		System.out.println("WIshMessageGenerator.setTime()");
		this.time = time;
	}
	
	// Developed the Business Method 
	public String showWishMessage(String user ) {
		
		System.out.println("WIshMessageGenerator.showWishMessage()");
		
		//Get Current Hour Of the Day 
		int hour = time.getHour();
		
		// Generate The Wish Message 
		
		if(hour < 12) 
			return "Good Morning " + user;
		
		else if(hour < 16 )
			return "Good Afternoon " + user;
		
		else if(hour < 20 )
			return "Good Evening " + user;
		
		else 
			return "Good Night " + user;
		
	}
	

}
