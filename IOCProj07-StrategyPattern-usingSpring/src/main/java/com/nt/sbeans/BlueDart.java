package com.nt.sbeans;


import org.springframework.stereotype.Component;
@Component("bd")
public final class BlueDart implements Courier
{
  public BlueDart()
  {
	  System.out.println("BlueDart.BlueDart()");
  }
  public String deliver(int oid)
  {
	  return oid+" is order is order is assainged to the Bluedart";
	  
  }
}
