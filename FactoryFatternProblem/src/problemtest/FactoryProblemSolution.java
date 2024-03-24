package problemtest;

public class FactoryProblemSolution {
 public static void main(String[] args) {
	Person per=FactoryPattern.getInstance("emp");
	System.out.println(per);
	
}
}
