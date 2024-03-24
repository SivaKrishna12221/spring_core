package com.nt.client;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Printer;

public class ClientTest2 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	
	/*
	 * Printer p1=Printer.getInstance(); Printer p2=Printer.getInstance();
	 * System.out.println(p1.hashCode()+" "+p2.hashCode());
	 * System.out.println("p1==p2?"+(p1==p2));
	 */
	
	  Printer p1=factory.getBean("p1",Printer.class);
	  Printer p2=factory.getBean("p2",Printer.class);
	  System.out.println(p1.hashCode()+" "+p2.hashCode());//gives two different
	  
	 }
}
