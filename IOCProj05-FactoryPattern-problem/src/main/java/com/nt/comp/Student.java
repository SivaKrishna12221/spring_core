package com.nt.comp;

public class Student  extends Person
{
  private String course;
  private int rollno;
  public Student(String name,String address,String course,int rollno,AadharDetails aadhar)
  {
	  super(name,address,aadhar);
	  System.out.println("Student.5-param constructor");
	  this.course=course;
	  this.rollno=rollno;
	  
  }
  @Override
  public String toString()
  {
	  return super.toString()+"Student[course="+course+"rollno"+rollno+"]";
	  
  }
}
