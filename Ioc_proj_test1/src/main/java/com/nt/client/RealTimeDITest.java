package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.model.Address;
import com.nt.model.Employee;
import com.nt.model.Organization;

public class RealTimeDITest 
{
  public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	Address adr=new Address("hyd","TN",500038l);
	Organization org=new Organization("Nit",adr);
	Integer id=Integer.valueOf(100);
	Employee employee=new Employee("Linkun",id,30000d,adr,org);
	Employee emp=ctx.getBean("emp",Employee.class);
	System.out.println(emp.toString());
  }
}
