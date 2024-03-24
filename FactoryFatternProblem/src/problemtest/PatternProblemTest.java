package problemtest;

import java.time.LocalDate;

public class PatternProblemTest {

	public static void main(String[] args) {

			AadharDetails adhar=new AadharDetails("siva","jp", LocalDate.of(2000, 10, 21));
			Person per=new Student(232l, adhar,"java" , 1200d);
		    System.out.println(per);
		    System.out.println("==========================");
		    Person pe2=new Employee(553l, adhar,"ediko","software");
		    System.out.println(pe2);
			}
	       
	
}



	


