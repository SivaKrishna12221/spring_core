package com.nt.comps;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component("vote")
@PropertySource(value="com/nt/commons/personalInfo.properties")
public class VoteEligibilityCheckingService
{
   @Value("${per.name}")
   private String name;
   @Value("${per.age}")
   private int age;
   private Date verifiedOn;
   @PostConstruct
   public void myInit()
   {
	   System.out.println("VoteEligibilityCheckingService.myInit()");
	   verifiedOn=new Date();
	   if(name==null||age<18)
	   {
		   throw new IllegalArgumentException("invalid name or age");
		   
	   }
	   
   }
   @PreDestroy
   public void myDestroy()
   {
	   System.out.println("VoteEligibilityCheckingService.myDestroy()");
	   name=null;
	   age=0;
	   verifiedOn=null;
   }
   public String checkVoteEligibility()
   {
	   if(age>=18)
	   {
		   return "mr./mrs./Miss."+name+" your age is "+age+" so your eligible";
		   
	   }
	   else
	   {
		   return "mr./mrs./miss."+name+" your age is "+age+"so your not eligible";
	   }
   }
   
}
