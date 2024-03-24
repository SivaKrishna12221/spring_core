package com.nt.sbeans;

import java.util.Date;

import org.springframework.stereotype.Component;


public class VoteEligibilityTest {

	private String name;
	private int age;
	private Date verifiedOn;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setVerifiedOn(Date verifiedOn) {
		this.verifiedOn = verifiedOn;
	}
  
	public void myInit()
	{
		this.verifiedOn=new Date();
		if(age<18)
		{
			throw new IllegalArgumentException("age should not be less than 18");
			
		}
	}
	public void myDestroy()
	{
		this.age=0;
		this.name=null;
		this.verifiedOn=null;
	}
    public String checkVoteEligibility(String name)
    {
    	if(age>18)
    	{
    		return name+":person is elgible for vote";
    	}
    	else
    	{
    		return name+":person is not eligible to vote";
    	}
    }

}
