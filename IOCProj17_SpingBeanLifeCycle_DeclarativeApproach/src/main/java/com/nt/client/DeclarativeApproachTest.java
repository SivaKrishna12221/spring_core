package com.nt.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.VoteEligibilityCheckingService;

public class DeclarativeApproachTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
	VoteEligibilityCheckingService service=ctx.getBean("check",VoteEligibilityCheckingService.class);
	String result=service.checkVotingEligibility();
	System.out.println(result);
	
}
}
