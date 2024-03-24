package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements Courier
{
	public BlueDart()
	{
		System.out.println("BlueDart.BlueDart()");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order id is assaigned to Bluedart";
	}

}
