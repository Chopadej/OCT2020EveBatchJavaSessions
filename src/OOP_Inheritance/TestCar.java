package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		final int a=10;// constant variable : variable value can't be change 
		//a=20;
		//a=30;
		System.out.println(a);
		
		final int days=7;
		int totalSalary=10*days;
		System.out.println(totalSalary);
		
		
		BMW b= new BMW();
		b.start();// Overridden method 
		b.stop(); //Inherited 
		b.refuel(); ////Inherited 
		b.autoParking();//Individual method of child class
		b.engine();// method from grand parent vehicle class
		System.out.println(b.color);// calling variable from child class becoz this variable is overridden from parent class
		
		
		//Object of Audi
		Audi ad= new Audi();
		ad.start();//Inherited method from parent class
		ad.stop();//Inherited method from parent class
		ad.refuel();//Inherited method from parent class
		ad.theftSafety();//Individual method of audi
		
		
		Car.wheels();// calling static method using class name
		
		Car c = new Car(); // Here only method present in the Parent class being called 
		c.start();
		c.stop();
		c.refuel();
		c.engine();// method from parent vehicle class
		
		//Top Casting 
		Car c1= new BMW(); // Child class object can be refereed by parent class reference variable
							// here individual methods of child class cant be accessed by using parent class ref variable
		c1.start();			// only called by using child class object reference only 
		c1.stop();
		c1.refuel();
		
		
		Vehicle v= new BMW();
		v.engine();// method from vehicle class
		
		
		//Down Casting : Is not allowed in java at the runtime we will get am error ClassCastException
		
		//BMW b1= (BMW) new Car();//ClassCastException at runtime

	}

}
