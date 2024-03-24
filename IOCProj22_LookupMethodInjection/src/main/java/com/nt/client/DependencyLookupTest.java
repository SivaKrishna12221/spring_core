package com.nt.client;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Cricketer;

public class DependencyLookupTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    Cricketer cricketer =ctx.getBean("cric",Cricketer.class);
    System.out.println(cricketer.getClass()+" "+cricketer.getClass().getSuperclass());
    System.out.println(Arrays.toString(cricketer.getClass().getDeclaredMethods()));
    
    cricketer.bowling();
    cricketer.fielding();
    cricketer.wicketKeeping();
    cricketer.batting();
}
}
