package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier
{
  public DHL()
  {
	 System.out.println("DHL.DHL()");
  }

@Override
public String deliver(int oid) {
	// TODO Auto-generated method stub
	return oid+"order id is assaigned to DHL courier service";
}
  
}
