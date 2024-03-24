package com.nt.client;

import java.util.Arrays;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.BankService;


public class MethodInjectionOrMethodReplacerTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	BankService service=ctx.getBean("bservice",BankService.class);
	Double compoundIntrest=service.calculateIntrestAmount(50000,10,2);
	System.out.println("compoundIntrest:"+compoundIntrest);
  }
}
