package com.nt.comps;

import org.springframework.stereotype.Component;

@Component
public class BankService 
{
  public double calculateIntrestAmount(double principle,double time,double rate)
  {
	System.out.println("BankService.calculateIntrestAmount()");

	return (principle*Math.pow(1+rate/100,time)-principle);
  }
}
