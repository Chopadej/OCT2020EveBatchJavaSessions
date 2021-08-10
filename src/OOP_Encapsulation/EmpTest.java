package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
	 
		Employee e1= new Employee();
		e1.name= "Peter";
		e1.age=25;
		
		e1.setSalary(12.33);
		System.out.println(e1.getSalary());
		
		e1.setTax(20);
		System.out.println(e1.getTax());
		
		System.out.println(e1.name + " "+e1.age);

	}

}
