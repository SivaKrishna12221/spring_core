package com.nt.methodReplacer;

public class StateBankOfIndia {

  public Double calculateCompoundIntrest(Double principle,Double percentage,int time)
  {
	  //compound intrest fml A=p(1+r/n)nt-p
	  Double ci=principle*Math.pow(1+percentage/100,time)-principle;
	  return ci;
  }
}
