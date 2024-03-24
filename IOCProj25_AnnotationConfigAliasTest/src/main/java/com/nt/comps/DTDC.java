package com.nt.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")

public class DTDC  implements Courier
{
  public DTDC()
  {
	  System.out.println("DTDC.DTDC()");
  }
  @Override
  public String deliver(int oid)
  {
	  return oid+" order id is assaigned to DTDC service";
  }
}
