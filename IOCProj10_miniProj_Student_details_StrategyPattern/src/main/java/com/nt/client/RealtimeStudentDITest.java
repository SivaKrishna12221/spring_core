package com.nt.client;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;
import com.nt.model.Student;

public class RealtimeStudentDITest 
{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter roll number:");
  int rollno=sc.nextInt();
  System.out.println("Enter name: ");
  String name=sc.next();
  System.out.println("enter maths marks:");
  int maths=sc.nextInt();
  System.out.println("enter stats marks:");
  int stats=sc.nextInt();
  System.out.println("enter comps marks:");
  int comps=sc.nextInt();
  Student student1=new Student();
  student1.setRollno(rollno);
  student1.setSname(name);
  student1.setMaths(maths);
  student1.setStats(stats);
  student1.setComps(comps);
  
  
  //creating Ioc container
  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
  StudentController controller=ctx.getBean("stuController",StudentController.class);
  try {
	  String resultmsg=controller.processStudent(student1);
	  System.out.println(resultmsg);
  }
  catch(Exception e)
  {
	  //System.out.println("internal problem--tryagagain:"+e.getMessage());
	  e.printStackTrace();
  }
  ctx.close();
		 
}
}
