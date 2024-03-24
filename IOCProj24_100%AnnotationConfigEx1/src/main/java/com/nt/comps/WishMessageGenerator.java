package com.nt.comps;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String generateWishMessage(String name) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = ldt.getHour();
		if (hour <= 12) {
			return "Good moring " + name;
		} else if (hour <= 16) {
			return "Good afternoon" + name;
		} else if (hour <= 19) {
			return "Good evening" + name;
		} else {
			return "Good night" + name;
		}
	}
}
