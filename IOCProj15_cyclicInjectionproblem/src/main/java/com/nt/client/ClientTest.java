package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.A;

public class ClientTest 
{
 public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	A a1=ctx.getBean("a1",A.class);
	System.out.println(a1);
	ctx.close();
}
}
