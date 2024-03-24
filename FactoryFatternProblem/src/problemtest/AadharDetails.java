package problemtest;

import java.time.LocalDate;

public class AadharDetails
{
	private String name;
	private String address;
	private LocalDate dof;
	public AadharDetails(
			String name, String address, LocalDate dof) {
		super();
		this.name = name;
		this.address = address;
		this.dof = dof;
	}
	@Override
	public String toString() {
		return "AadharDetails [name=" + name + ", address=" + address + ", dof=" + dof + "]";
	}
	
}