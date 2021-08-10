package OOP_Encapsulation;

public class TestUsers {

	public static void main(String[] args) {

		Users user = new Users(12.33, "900, London UK");
		System.out.println(user.getSalary()+ " "+user.getAddress());
		
		user.setSalary(15.99);
		user.setAddress("London UK");
		System.out.println(user.getSalary()+ " "+user.getAddress());
	}

}
