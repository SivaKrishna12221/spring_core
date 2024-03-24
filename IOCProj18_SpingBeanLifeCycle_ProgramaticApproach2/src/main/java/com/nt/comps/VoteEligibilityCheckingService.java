package com.nt.comps;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("vote")
public class VoteEligibilityCheckingService implements InitializingBean, DisposableBean {
	private String name;
	private int age;
	private Date verifiedOn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void destroy() throws Exception {
		name = null;
		age = 0;
		verifiedOn = null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("VoteEligibilityCheckingService.afterPropertiesSet()");
		verifiedOn = new Date();
		if (name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs (name or age)");

		}
	}

	public String checkVotingEligibility() {
		System.out.println("VoteEligibilityCheckingService.checkVotingEligibility()" + verifiedOn);
		if (age >= 18) {
			return "mr./mrs/miss" + name + " your age is " + age + " so your elgible";

		} else {
			return "master" + name + " your age is " + age + " your not eligible for vote";
		}
	}
}
