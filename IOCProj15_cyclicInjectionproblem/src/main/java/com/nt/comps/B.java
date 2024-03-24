package com.nt.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("b")
public class B 
{
  
  private A a;
  @Autowired
  public B(A a)
  {
	  this.a=a;
	  System.out.println("B.B()");
  }
	/*
	 * public void setA(A a) { this.a=a; System.out.println("B.setA()"); }
	 */
  public String toString()
  {
	  return "b[class obj]";
  }
}
