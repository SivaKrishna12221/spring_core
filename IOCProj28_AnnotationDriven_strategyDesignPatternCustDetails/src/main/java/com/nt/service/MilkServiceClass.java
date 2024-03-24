package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.MilkDAOInterface;
import com.nt.model.MilkSeller;
@Service("milkservice")
public class MilkServiceClass implements MilkServiceInterface
{
  @Autowired
  @Qualifier("oracleDao")
  private MilkDAOInterface mdi;
  
  public String calculateAmount(MilkSeller ms)throws Exception
  {
	int count=0;
	 float litres=ms.getLitres();
	 float fat=ms.getFat();
	 float litrecost=ms.getLitreCost();
	 
	 float perlitreAmount=(litrecost*fat/10);
	 float amount=perlitreAmount*litres;
	 ms.setAmount(amount);
		
     count=mdi.insertData(ms);//it is used to insert the data into database table 
	 
		return 
				  count== 0 ?"entered failed"://it is for our understanding purpose either it enter data or no
				 
					"milk seller having amount::"+ms.getAmount();
		  
  }


}



	


