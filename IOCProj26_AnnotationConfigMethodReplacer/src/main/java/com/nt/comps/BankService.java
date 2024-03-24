package com.nt.comps;

import org.springframework.stereotype.Component;


public class BankService 
{
  public double serviceMethod(double pmt,double rate,double time)
  {
	 System.out.println("BankService.service()");
	 double compoundIntrest;
	 return compoundIntrest=(pmt*Math.pow(1+rate/100,time))-pmt;
  }
}
