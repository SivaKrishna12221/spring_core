package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements Courier
{
 public DHL()
 {
	 System.out.println("DHL.DHL()");
 }
 public String deliver(int oid)
 {
	 return oid+" is order id is assaigned to DHL";
 }
}
