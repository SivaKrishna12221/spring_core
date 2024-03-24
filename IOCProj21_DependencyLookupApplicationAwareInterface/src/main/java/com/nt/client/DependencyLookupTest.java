package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Cricketer;

public class DependencyLookupTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    Cricketer cricketer =ctx.getBean("cric",Cricketer.class);
    cricketer.bowling();
    cricketer.fielding();
    cricketer.wicketKeeping();
    cricketer.batting();
}
}
