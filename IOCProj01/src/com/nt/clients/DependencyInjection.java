package com.nt.clients;

import java.time.LocalDateTime;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjection 
{
  public static void main(String[] args)
  {
	BeanFactory ctx=new  FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	Object obj=ctx.getBean("msg");
	WishMessageGenerator generator =(WishMessageGenerator)obj;
	String result=generator.generateWishMessage("siva");
	System.out.println("result:"+result);
	System.out.println("aliass name:");
	LocalDateTime dt4=ctx.getBean("l1",LocalDateTime.class);
	LocalDateTime dt5=ctx.getBean("l2",LocalDateTime.class);
	System.out.println(dt4+" "+dt5);
	
}





}
