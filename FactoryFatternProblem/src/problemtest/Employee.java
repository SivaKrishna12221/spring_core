package problemtest;

public class Employee extends Person {

	public Employee(Long mobile, AadharDetails adhar, String company, String job) {
		super(mobile, adhar);
		this.company = company;
		this.job = job;
	}

	private String company;

	@Override
	public String toString() {
		return "Employee [company=" + company + ", job=" + job + "]";
	}

	private String job;
}
