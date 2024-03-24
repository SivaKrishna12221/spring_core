package com.nt.comp;

public class Student extends Person
{
 private String course;
 private int rollno;
 public Student(String course,int rollno,AadharDetails aadhar,String name,String address)
 {
	 super(name,address,aadhar);
	 this.course=course;
	 this.rollno=rollno;
	 
	 System.out.println("Student.Student()");
 }
 public String toString()
 {
	 return "Student [course"+course+"rollno"+rollno+"]";
 }
}
