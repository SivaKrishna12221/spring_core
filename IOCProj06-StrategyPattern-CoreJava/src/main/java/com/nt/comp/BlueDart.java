package com.nt.comp;

public final class BlueDart implements Courier
{//dependent class two
  public BlueDart()
  {
	  System.out.println("enclosing_type.enclosing_method()");
  }
  public String deliver(int oid)
  {
	  return oid+" order id is order assaign to Bluedart for delivary";
	  
  }
}
