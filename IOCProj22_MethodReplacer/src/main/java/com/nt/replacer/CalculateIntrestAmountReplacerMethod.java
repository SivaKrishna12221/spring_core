package com.nt.replacer;

import java.lang.reflect.Method;


import org.springframework.beans.factory.support.MethodReplacer;

public class CalculateIntrestAmountReplacerMethod implements MethodReplacer
{
  @Override
  public Object reimplement(Object obj,Method method,Object[] args) throws Throwable
  {
	  System.out.println("CalculateIntrestAmountReplacerMethod.reimplement():calculateIntrestAmount");
	  double principle=(double)args[0];
	  double rate=(double)args[1];
	  double time=(double)args[2];
	  double intrestAmount;
	  return intrestAmount=principle*time*rate/100;
  }
}
