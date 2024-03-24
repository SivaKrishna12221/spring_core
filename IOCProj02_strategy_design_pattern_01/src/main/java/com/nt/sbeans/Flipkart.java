package com.nt.sbeans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fkart")
public class Flipkart {

	@Autowired
	private  ICourierService courier;
	
	public String flipkartUsingServices(String []items,Double[] prices)
	{
		double totalamount=0;
		for(Double d:prices)
		{
			totalamount+=d;
		}
		String services=courier.services();
		return services+" items are"+Arrays.toString(items)+" with total amount"+totalamount;
	}
	
}
