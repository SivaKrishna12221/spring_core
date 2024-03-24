package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Vehicle
{
   private Engine engine;
public Vehicle()
{
	System.out.println("Vehicle.Vehicle()");
}

public void setEngine(Engine engine) {
	this.engine = engine;
}
 //business logic
public String purchase(String cars[],double price[]) 
{
	double billAmount=0.0;
	for(double amount:price)
	{
		billAmount+=amount;
	}
	int id=new Random().nextInt(1000);
	String msg=engine.run(id);
	return "your purchased "+Arrays.toString(cars)+" cars with your total amount"+billAmount+"==>"+msg;
}
   
}
