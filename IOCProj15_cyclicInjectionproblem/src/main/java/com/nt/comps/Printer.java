package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("printer")
public class Printer 
{
  private static Printer INSTANCE;
  private Printer()
  {
	  System.out.println();
  }
  public  static Printer getInstance()
  {
	  Printer per=null;
	  if(INSTANCE==null)
	  {
		 INSTANCE=new Printer();
		 return INSTANCE;
	  }
	  else
	  {
		  return INSTANCE;
	  }
  }
  private void print(String msg)
  {
	  System.out.println(msg);
  }
}
