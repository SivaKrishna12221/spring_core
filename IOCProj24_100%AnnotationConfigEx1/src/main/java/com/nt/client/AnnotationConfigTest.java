package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.AppConfig;
import com.nt.comps.WishMessageGenerator;

public class AnnotationConfigTest 
{
   public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	WishMessageGenerator wmg=ctx.getBean("wmg",WishMessageGenerator.class);
	String result=wmg.generateWishMessage("siva");
	System.out.println(result);
	
}
}
