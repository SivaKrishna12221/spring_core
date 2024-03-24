package problemtest;
class Student extends Person
{
	
	private String course;
	private Double fees;
	public Student(Long mobile, AadharDetails adhar, String course, Double fees) {
		super(mobile, adhar);
		this.course = course;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [course=" + course + ", fees=" + fees + "]";
	}
}