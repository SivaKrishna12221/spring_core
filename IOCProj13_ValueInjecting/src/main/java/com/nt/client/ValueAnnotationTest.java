package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.PersonalInfo;

public class ValueAnnotationTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	PersonalInfo info=ctx.getBean("pinfo",PersonalInfo.class);
	String result=info.toString();
	System.out.println(result);
	
}
}
