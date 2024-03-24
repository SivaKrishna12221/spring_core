package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.comps.WishMessageGenerator;

public class DependencyInjection
{
 public static void main(String[] args) {
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj=ctx.getBean("wmg");
	WishMessageGenerator generator=(WishMessageGenerator)obj;
	String result=generator. generatewishmessage("raja");
	System.out.println(result);
	ctx.close();
	
	
}
}
