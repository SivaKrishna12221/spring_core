package com.nt.factory;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class PersonFactory 
{
  public static Person getInstance(String  persontype)
  {
	  Person per=null;
	  {
		  if(persontype.equalsIgnoreCase("emp"))
		  {
			  
		  
			  AadharDetails details=new AadharDetails(453453l,23,7799352324l);
			  per=new Employee("siva","kadapa",details,"infosis",34534.45);
			  
		  }
		  else if (persontype.equalsIgnoreCase("stud"))
			  {
               AadharDetails details=new AadharDetails(353463l,34,3453463l);
               per=new Student("ram",34,details,"java","kurnool");
               
	  }
		  else if(persontype.equalsIgnoreCase("cust"))
		  {
			  AadharDetails details=new AadharDetails(353463l,34,3453463l);
              per=new Customer("raghava","karachi",details,599,5757.67);
		  }
		  else {
			  throw new IllegalArgumentException("invalid PersonType");
		  }
		  return per;
  }
  }
}
