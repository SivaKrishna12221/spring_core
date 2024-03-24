package com.nt.LookupMethodInjection;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
@Component("bike")
public abstract class Bike {

	@Lookup
	public abstract EngineCapacity getEngineDetails();
	public String getBikeEngineCapacity()
	{
		EngineCapacity engine=getEngineDetails();
	    int cap=engine.getEngineCapacity();
		return "Bike engine capacity is"+cap;
	}
}
