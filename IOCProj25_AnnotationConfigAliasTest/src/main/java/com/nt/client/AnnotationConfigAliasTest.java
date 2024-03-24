package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.AppConfig;
import com.nt.comps.Flipkart;

public class AnnotationConfigAliasTest 
{
 public static void main(String[] args) {
	

  AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
  Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
  String shop=fpkt.shopping(new String[] {"jangry","laddu","badhusa","kavva"},new double[] {30,25,15,50});
  System.out.println(shop);
  
}
}
