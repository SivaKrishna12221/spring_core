package com.nt.client;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryProblemSolutionTest 
{
   public static void main(String[] args) {
   Person emp=PersonFactory.getInstance("emp");
   System.out.println(emp);
   System.out.println("************");
   Person stu=PersonFactory.getInstance("stu");
   System.out.println(stu);
   System.out.println("***********");
   Person cust=PersonFactory.getInstance("cust");
   System.out.println(cust);
   
}
}
