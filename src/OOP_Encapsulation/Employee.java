package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private double salary; // Private variable can not be access outside of the class, within the class can be accessible 
	private int tax;
	
	//Encapsulation: you have to hide all the private variables with the help of public methods 
	//public getter and setter:
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

		
		

	public static void main(String[] args) {
		Employee obj= new Employee();
		obj.name= "Tom";
		obj.salary= 123.44;
		obj.tax= 20;
		
		
	}


}
