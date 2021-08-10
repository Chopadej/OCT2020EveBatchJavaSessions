package OOP_Inheritance;

public class Car extends Vehicle{
	
	String color= "Red";
	
	
	public void start() {
		System.out.println("car---start");
	}
	
	public void stop() {
		System.out.println("car---stop");
	}
	public void refuel() {
		System.out.println("car---refuel");
	}
	
	public static void wheels() {
		System.out.println("Car---wheels");
	}
	
}

// Important concept of final keyword
//If we declare class as a final keyword then its prevent inheritance that is No child class can be created from that class
//If we declare method as a final keyword then it can not be overriden 