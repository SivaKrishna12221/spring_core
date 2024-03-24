package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.CustomerController;
import com.nt.model.Customer;

public class LayeredAppTest1 {

	
	public static void main(String[] args)throws Exception{
	// ClassPathXmlApplicationContext ctx= new  	ClassPathXmlApplicationContext("applicationContext.xml");
		try {
	FileSystemXmlApplicationContext ctx=	new FileSystemXmlApplicationContext("src/main/java/com/nt/config/applicationContext.xml");
	 Customer cust=new Customer(10,"siva",30000d,12.2);
	 CustomerController custcon= ctx.getBean("cust-controller",CustomerController.class);
	String result= custcon.saveCustDetails(cust);
	System.out.println(result);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
