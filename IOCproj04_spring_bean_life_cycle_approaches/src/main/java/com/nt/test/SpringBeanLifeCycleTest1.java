package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VoteEligibilityProgrammaticApproach;
import com.nt.sbeans.VoteEligibilityTest;
import com.nt.sbeans.VoteEligibiltyAnnotationConfig;

public class SpringBeanLifeCycleTest1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * VoteEligibilityTest test=ctx.getBean("vote",VoteEligibilityTest.class);
		 * String result=test.checkVoteEligibility("siva");
		 */
		/*
		 * VoteEligibilityProgrammaticApproach
		 * test=ctx.getBean("vote",VoteEligibilityProgrammaticApproach.class); String
		 * result= test.programmaticApproach("siva");
		 */	
		VoteEligibiltyAnnotationConfig test=ctx.getBean("vote",VoteEligibiltyAnnotationConfig.class);
		String result=test.programmaticApproach("siva");
		System.out.println(result);
	}
}
