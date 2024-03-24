package com.nt.client;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

public class RealTimeEmployeDItest
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee number:");
	int empno=sc.nextInt();
	System.out.println("enter employee name;");
	String ename=sc.next();
	System.out.println("enter job:");
	String job=sc.next();
	System.out.println("enter salary per month:");
	int sal=sc.nextInt();
	Employee emp=new Employee();
	emp.setEmpno(empno);
	emp.setEname(ename);
	emp.setJob(job);
	emp.setSal(sal);
	//creating IOC container by using class path
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	EmployeeController controller=ctx.getBean("empController",EmployeeController.class);
	try
	{
		String resultMsg=controller.processEmployee(emp);
		System.out.println(resultMsg);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
