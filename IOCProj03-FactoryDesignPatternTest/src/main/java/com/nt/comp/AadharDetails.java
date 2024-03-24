package com.nt.comp;

public class AadharDetails 
{
  private long adhno;
  private int age;
  private long mobileno;
  public  AadharDetails(Long adhno,int age,Long mobileno)
  {
	  System.out.println("AadharDetails.AadharDetails()");
	  this.adhno=adhno;
	  this.age=age;
	  this.mobileno=mobileno;
	  
  }
  public String toString()
  {
	  return "AdharDetails[aadharno:"+adhno+" age:"+age+"mobileno:";
  }
}
