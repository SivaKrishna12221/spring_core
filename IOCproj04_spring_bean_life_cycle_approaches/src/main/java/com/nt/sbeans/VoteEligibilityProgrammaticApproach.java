package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class VoteEligibilityProgrammaticApproach implements InitializingBean,DisposableBean{

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
	@Override
	public void afterPropertiesSet() throws Exception {
		
		if(age<18)
			throw new IllegalArgumentException("age must be greater than  18");
	}@Override
	public void destroy() throws Exception {
		name=null;
		age=0;
		verifiedOn=null;
		
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
	public String programmaticApproach(String siva)
	{
		return "eligible "+siva;
	}
}
