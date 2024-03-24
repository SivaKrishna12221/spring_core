package com.nt.comp;

public class Employee  extends Person
{
  private String  compony;
  private double salary;
  public Employee(String name,String address,AadharDetails aadhar,String compony,double salary)
  {
	  super(name, address, aadhar);
	  System.out.println("Employee ,5:param constructor");
	  this.compony=compony;
	  this.salary=salary;
	  
  }
  public String toString()
  {
	  return super.toString()+"Employee[compony="+compony+"salary="+salary+"]";
  }
}
