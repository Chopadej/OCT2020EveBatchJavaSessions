package OOP_Encapsulation;

public class Users {
	
	private double salary;
	private String address;
	
	//Constructor
	public Users(double salary, String address) {
		this.salary = salary;
		this.address = address;
	}

	//getter and setter
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
