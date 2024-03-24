package com.nt.factory;

import com.nt.comp.DEngine;
import com.nt.comp.EEngine;
import com.nt.comp.Engine;
import com.nt.comp.PEngine;
import com.nt.comp.Vehicle;

public class VehicleFactory
{
   public static Vehicle getInstance(String engineType)
   {
	   Engine engine=null;
	   if(engineType.equalsIgnoreCase("p_engine"))
		   engine=new PEngine();
	   else if(engineType.equalsIgnoreCase("E_engine"))
		   engine=new EEngine();
	   else if(engineType.equalsIgnoreCase("D_engine"))
		   engine=new DEngine();
	   else
		   throw new IllegalArgumentException("invalid engine type");
	   Vehicle vcle=new Vehicle();
	   vcle.setEngine(engine);
	   return vcle;
	  
		   
   }
}
