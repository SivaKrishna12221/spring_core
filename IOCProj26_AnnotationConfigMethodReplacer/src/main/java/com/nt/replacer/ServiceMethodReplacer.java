package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ServiceMethodReplacer implements MethodReplacer
{
@Override
  public Object reimplement(Object obj,Method method,Object[] args) throws Throwable
{
	System.out.println("ServiceMethodReplacer.reimplement()");
	  double pmt=(double)args[0];
	  double rate=(double)args[1];
	  double time=(double)args[2];
	  double simpleIntrest;
	  return simpleIntrest=(pmt*rate*2/100);
	  
	  
}
}

