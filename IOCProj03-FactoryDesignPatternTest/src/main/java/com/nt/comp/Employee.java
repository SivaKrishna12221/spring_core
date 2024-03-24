package com.nt.comp;

public class Employee extends Person
{
 private  String company;
 private double sal;
 public Employee(String name,String address,AadharDetails aadhar,String company,double sal)
 {
	
	 super(name,address,aadhar);
	 System.out.println("Employee.Employee()");
	 this.company=company;
	 this.sal=sal;
 }
 
}
