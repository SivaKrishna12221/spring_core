package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.VoteEligibilityCheckingService;

public class AnnotationApproachTest
{
 public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	VoteEligibilityCheckingService service=ctx.getBean("vote",VoteEligibilityCheckingService.class);
    String result=service.checkVoteEligibility();
    System.out.println(result);
}
}
