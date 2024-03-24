package problemtest;

public abstract class Person{
	private Long mobile;
	private AadharDetails adhar;
	public Person(Long mobile, AadharDetails adhar) {
		super();
		this.mobile = mobile;
		this.adhar = adhar;
	}
	
}