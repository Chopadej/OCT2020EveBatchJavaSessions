package OOP_Inheritance;

public class BMW extends Car {
	
	String color= "Blue";
	
	//Method Overriding
	//When we have a method in parent class and same method in the child class with the same name
	// and same number of parameters
	//return type should be same in both the methods
	//RunTime Poly+Morphism
	
	//Multiple Inheritance: Diamond problem- is not allowed from class to class
	//Its allowed with interface to class
	
	//Multi level inheritance is allowed in JAVA 
	
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	
	public void autoParking() {
		System.out.println("BMW----AutoParking");
	}
	
	
	//Static method is not override in JAVA but we can Overload the static method like main method
	//@Override- 
/*	public static void wheels() {
		System.out.println("Car---wheels");
	}
	*/
}
