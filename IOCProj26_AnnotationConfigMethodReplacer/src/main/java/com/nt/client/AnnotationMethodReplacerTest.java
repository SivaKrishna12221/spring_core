package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.AppConfig;
import com.nt.comps.BankService;

public class AnnotationMethodReplacerTest
{
  public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	BankService bank=ctx.getBean("bservice",BankService.class);
	double result=bank.serviceMethod(100000,10,2);
	System.out.println(result);
}
}
