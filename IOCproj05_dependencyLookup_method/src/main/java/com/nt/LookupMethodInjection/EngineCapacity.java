package com.nt.LookupMethodInjection;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("engine")
public class EngineCapacity {

	public int getEngineCapacity()
	{
		return new Random().nextInt(1000);
	}
}
