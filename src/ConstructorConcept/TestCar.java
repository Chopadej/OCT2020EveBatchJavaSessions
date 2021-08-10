package ConstructorConcept;

public class TestCar {

	public static void main(String[] args) {
		Car c1= new Car("Alto", 3);
		Car c2= new Car("BMW", 70, "Blue", 12.22);
		Car c3= new Car("Audi", 80, "red");
		
		System.out.println(c1.name+ " "+c1.color+ " "+c1.price+ " "+c1.mileage);
		
		System.out.println(c2.name+ " "+c2.color+ " "+c2.price+ " "+c2.mileage);
		
		/*Login lp= new Login("tom@gmail.com", "Tom123");
		System.out.println(lp.Username);
		System.out.println(lp.pwd);
		*/
		/*Login lp1= new Login("admin", "admin");
		System.out.println(lp1.Username + " "+lp1.pwd);
		*/
		
		Login lp_cust= new Login("tom@gmail.com", "Tom123");
		lp_cust.doLogin(lp_cust.Username, lp_cust.pwd);
		
		Login lp_seller= new Login("xeaon@gmail.com", "xeon123");
		lp_seller.doLogin(lp_seller.Username, lp_seller.pwd);
		
		Login lp_dist= new Login("abc@gmail.com", "abc123", "distributor");
		lp_dist.doLogin(lp_dist.Username, lp_dist.pwd, lp_dist.role);

	}

}
