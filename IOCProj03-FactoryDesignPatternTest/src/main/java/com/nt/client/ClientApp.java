package com.nt.client;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class ClientApp 
{
 public static void main(String[] args) {
	Person per=PersonFactory.getInstance("emp");
	System.out.println(per);
	Person per2=PersonFactory.getInstance("stud");
	System.out.println(per2);
	Person per3 =PersonFactory.getInstance("cust");
	System.out.println(per3);
}
}
