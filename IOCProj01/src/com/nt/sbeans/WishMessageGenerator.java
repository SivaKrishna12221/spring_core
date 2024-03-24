package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msg")
//target class object
public class WishMessageGenerator {
	// predefined property is for create injecting ==HAS-A relation
	@Autowired
	@Qualifier("ldt1")
	private LocalDateTime dateTime;
	
	//private Date date;
	// to inject the dependent class object to target class
	// IOC container uses the setter method of target class to
	// to assign the dependent class object to the target class object

	
	/*
	 * @Autowired (required=false) public WishMessageGenerator(LocalDateTime
	 * dateTime) {
	 * System.out.println("WishMessageGenerator.wishMessageGenerator()");
	 * this.dateTime=dateTime;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Autowired public WishMessageGenerator(Date date) {
	 * System.out.println("WishMessageGenerator.WishMessageGenerator()");
	 * this.date=date;
	 * 
	 * }
	 */
	  
	/*
	 * 
	 * @Autowired public void assignDateTime(LocalDateTime dateTime) {
	 * System.out.println("WishMessageGenerator.setDateTime()");
	 * this.dateTime=dateTime; }
	 * 
	 * @Autowired public void putDate(Date date) {
	 * System.out.println("WishMessageGenerator.setDate()"); this.date=date; }
	 */
	// business logic
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.0-param constructor");
		// get current hour of the day
		int hour = dateTime.getHour();
		if (hour < 12)
			return "Good morning:" + user;
		else if (hour < 16)
			return "Good Afternoon:" + user;
		else if (hour < 20)
			return "Good Evening:" + user;
		else
			return "Good night";
	}
	
}
