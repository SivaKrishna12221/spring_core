package com.nt.client;

import com.nt.comp.AadharDetails;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

public class FactoryPatternProblemTest {
	public static void main(String[] args) {
		AadharDetails aadhar = new AadharDetails(353768203807l, 22, 7799352324l);
		Person stu = new Student("siva", "kadapa", "Java", 234, aadhar);
		System.out.println(stu);
		System.out.println("******************");
		AadharDetails aadhar1 = new AadharDetails(543553l, 20, 34452l);
		Person emp = new Employee("sitha", "jp", aadhar, "infosys", 30000);
		System.out.println(emp);

	}
}
