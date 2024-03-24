package com.nt.client;

import java.sql.SQLException;
import java.util.Scanner;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.CustomerOperationController;
import com.nt.model.Customer;

public class RealTimeDITest 
{
  public static void main(String[] args) {
	//here creating an object
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter name:");
	  String s1=sc.next();
	  System.out.println("enter address:");
	  String s2=sc.next();
	  System.out.println("enter bill amount:");
	  double d1=sc.nextDouble();
	  System.out.println("enter discount:");
	  double d2=sc.nextDouble();
	  Customer cs=new Customer();
	  cs.setCname(s1);
	  cs.setAddress(s2);
	  cs.setBillamount(d1);
	  cs.setDiscount(d2);
	  
	  //creating ioc container ;
	  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	  CustomerOperationController  cos=ctx.getBean("custController",CustomerOperationController.class); 
	  
	try {
		String result=cos.processCustomer(cs);
		System.out.println(result);
	} catch (SQLException se) {
		// TODO Auto-generated catch block
		//System.out.println("internal problem_ try again:"+e.getMessage());
		if(se.getErrorCode()==12899)
			System.out.println("problem with column size");
		else
			System.out.println("one or another db problem");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	ctx.close();
}
}
