package JavaSession;

public class Car {
	// Concept of static variable 
	String name;
	String model;
	int price;
	String color;// here name, model, price and color are common properties
	static int wheels= 4; // here wheels are common properties along with common value as well
	
	//Static variable never be stored inside the Object or Object can not hold any static variable
	//So it will be stored inside Permanent Generation( called before JDK 1.8), now it is called Metaspace or 
	//CMA- common memory allocation 
	// Static variable have the common values for all the objects
	// So common properties values can be stored as static variable  	

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name= "BMW";
		c1.model= "520d";
		c1.price= 80;
		c1.color= "Blue";
		//c1.wheels= 4;
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(Car.wheels);// So static variable is always access by using class name 
		
		Car c11 = new Car();
		c1.name= "Audi";
		c1.model= "Q5";
		c1.price= 75;
		c1.color= "White";
		//c1.wheels= 4;
		
		Car c12 = new Car();
		c1.name= "Honda";
		c1.model= "Civic";
		c1.price= 30;
		c1.color= "Black";
		//c1.wheels= 4;
		
		Car c13 = new Car();
		c1.name= "Maruti";
		c1.model= "Alto";
		c1.price= 3;
		c1.color= "Red";
		//c1.wheels= 4;
	}

}
