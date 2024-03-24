package com.nt.sbeans;

import java.util.Date;

public class VoteEligibiltyAnnotationConfig {

	private String name;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getVerifiedOn() {
		return verifiedOn;
	}

	private int age;
	private Date verifiedOn;

	@PreDestroy
	public void myDestroyMethod() {
		name = null;
		age = 0;
		verifiedOn = null;
	}

	public void myInitMethod() {

		if (age < 18)
			throw new IllegalArgumentException("age must be greater than  18");

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setVerifiedOn(Date verifiedOn) {
		this.verifiedOn = verifiedOn;
	}

	public String programmaticApproach(String siva) {
		return "eligible " + siva;
	}
}
