package com.nt.methodReplacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplacerClass implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		Double principle=(Double)args[0];
		Double rate=(Double)args[1];
		int time=(int)args[2];
		Double si=principle*rate*time/100;
		return si;
	}
}
