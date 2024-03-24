package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest 
{
  public static void main(String[] args) {
	  //create IOC container
	FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	//get target Spring bean class obj ref
	Object obj=ctx.getBean("sf");
	//typecasting
	SeasonFinder finder=(SeasonFinder)obj;
	//invoke the b,method
	String result=finder.findoutSeasonName(" Ramana");
	System.out.println(result);
	//close container
	ctx.close();
}
}
