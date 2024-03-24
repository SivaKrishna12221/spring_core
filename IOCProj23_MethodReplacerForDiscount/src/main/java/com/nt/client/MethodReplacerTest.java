package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.comps.Shopping;

public class MethodReplacerTest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    Shopping shop=ctx.getBean("shop",Shopping.class);
    int bill=shop.billAmount(3443,23242,23,32);
    System.out.println("your bill amount with discount:"+bill);
}
}
