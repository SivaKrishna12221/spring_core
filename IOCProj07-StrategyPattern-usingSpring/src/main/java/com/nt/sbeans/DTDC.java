package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")

public final class DTDC implements Courier
{
   public DTDC()
   {
	   System.out.println("DTDC.DTDC()");
   }
   public String deliver(int oid)
   {
	   return oid+" is order id is order assign to DTDC ";
   }
}
