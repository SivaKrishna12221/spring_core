package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class DiscountBillAmount implements MethodReplacer
{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		int price1=(int)args[0];
		int price2=(int)args[1];
		int price3=(int)args[2];
		int discount=(int)args[3];
		int calcdiscount;
		int totalamount=price1+price2+price3;
		calcdiscount=(price1+price2+price3)*discount/100;
		int billamount=totalamount-calcdiscount;
		return billamount;
	     
		
	}
 
}
