package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.AppConfig;
import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest 
{
  public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	 SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	 String result=finder.findoutSeasonName("siva");
	 System.out.println(result);
}
}
