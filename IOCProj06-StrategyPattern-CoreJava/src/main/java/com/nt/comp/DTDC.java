package com.nt.comp;

public final class DTDC implements Courier 
{//dependent class one
	public DTDC()
	{
		System.out.println("DTDC.DTDC()");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+"order id is order is assaingned to DTDC for delivery";
	}

}
