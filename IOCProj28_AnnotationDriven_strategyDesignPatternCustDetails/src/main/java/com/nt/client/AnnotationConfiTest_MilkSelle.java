package com.nt.client;

import java.sql.SQLException;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.config.AppConfig2;
import com.nt.controller.MilkControllerClass;
import com.nt.model.MilkSeller;

public class AnnotationConfiTest_MilkSelle 
{
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Id:");
   int id=sc.nextInt();
   System.out.println("Enter Name:");
   String name=sc.next();
   System.out.println("Enter Address:");
   String address=sc.next();
   System.out.println("Enter liters:");
   float litres=sc.nextFloat();
   System.out.println("Enter Fat:");
   float fat=sc.nextFloat();
   System.out.println("Enter perlitre Cost:");
   float litreCost=sc.nextFloat();
   MilkSeller ms=new MilkSeller(); 
   ms.setId(id);
   ms.setName(name);
   ms.setAddress(address);
   ms.setLitres(litres);
   ms.setFat(fat);
   ms.setLitreCost(litreCost);
   AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig2.class);
   
   MilkControllerClass mcc=ctx.getBean("milkcontroller",MilkControllerClass.class);
   
   try {
	String result=mcc.processController(ms);
	   
	   System.out.println(result);
} catch (SQLException se)
   {
	if(se.getErrorCode()==12899)
	{
		System.out.println("problem with column size");
	}
	else
	{
		System.out.println("one or another data base problem");
	}
   }
   catch(Exception e)
   {
	   System.out.println("non db problem"+e);
   }
   ctx.close();
}
}
