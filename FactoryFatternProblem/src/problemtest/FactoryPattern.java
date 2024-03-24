package problemtest;

import java.time.LocalDate;

public class FactoryPattern {

	public static Person getInstance(String per)
	{
		Person person=null;
		if(per.equalsIgnoreCase("stud"))
		{
			AadharDetails adhar=new AadharDetails("siva","jp", LocalDate.of(2000, 10, 21));
		return	 person=new Student(232l, adhar,"java" , 1200d);
	
		}
		else if(per.equalsIgnoreCase("emp"))
		{
			AadharDetails adhar=new AadharDetails("siva","jp", LocalDate.of(2000, 10, 21));
			  Person emp=new Employee(553l, adhar,"ediko","software");
				  return emp;
		}
		else
			throw new IllegalArgumentException("Invalid person");
	}
}
