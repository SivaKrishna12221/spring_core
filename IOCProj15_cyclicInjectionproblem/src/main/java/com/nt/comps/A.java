package com.nt.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A 
{
  @Autowired
  private B b;
  public A()
  {
	  System.out.println("A.A()");
  }
	/*
	 * public void setB(B b) { this.b=b; System.out.println("A.setB()"); }
	 */
  public String toStirng()
  {
	  return "A[a class obj]";
  }
}
