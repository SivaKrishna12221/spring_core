package com.nt.factory;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory
{
	public static Person getInstance(String personType)
	{
		Person  per=null;
		if(personType.equalsIgnoreCase("emp"))
		{
		AadharDetails aadhar=	new AadharDetails(3453l,34,3453563463l);
		per =new Employee("sitha","jp",aadhar,"infosys",30000);
		 
		}
		else if(personType.equalsIgnoreCase("stu"))
		{
			AadharDetails aadhar=new AadharDetails(3453234l,32,34534534l);
			per=new Student("rama","kmp","bcom",12,aadhar);
		}
		else if(personType.equalsIgnoreCase("cust"))
		{
			AadharDetails aadhar=new AadharDetails(3453543l,32,535363l);
			per=new Customer("krishna","kadapa",aadhar,101,20233.2);
					
		}
		else
		{
			throw new IllegalArgumentException("invalid persontype");
		}
		return per;
	}

}
