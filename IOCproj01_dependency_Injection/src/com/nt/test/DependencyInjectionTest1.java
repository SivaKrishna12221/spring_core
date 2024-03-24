package com.nt.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;


import com.nt.sbeans.WishMessageGenerator;


public class DependencyInjectionTest1 {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		WishMessageGenerator  target=ctx.getBean("wmg",WishMessageGenerator.class);
	    String result=target.messageGenerator("siva");
	    System.out.println(result);
	}
}
