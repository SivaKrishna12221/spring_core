package com.nt.comps;

import java.util.Date;

public class VoteEligibilityCheckingService {
	private String name;
	private int age;
	private Date verifiedOn;

	public VoteEligibilityCheckingService() {
		System.out.println("VoteEligibilityCheckingService.0-param");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("VoteEligibilityCheckingService.setName()");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("VoteEligibilityCheckingService.setAge()");
		this.age = age;
	}

	public void myInit() {
		System.out.println("VoteEligibilityCheckingService.myInit()");
		verifiedOn = new Date();
		if (name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs(name or age");
		}
	}

	public void myDestroy() {
		System.out.println("VoteEligibilityCheckingService.myDestroy()");
		name = null;
		age = 0;
		verifiedOn = null;
	}

	//business method
	public String checkVotingEligibility() {
		System.out.println("VoteEligibilityCheckingService.checkVotingEligibility()" + verifiedOn);
		if (age >= 18) {
			return "mr./mrs/miss" + name + " your age is " + age + " so your elgible";

		} else {
			return "master" + name + " your age is " + age + " your not eligible for vote";
		}
	}
}
