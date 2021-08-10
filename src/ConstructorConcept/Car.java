package ConstructorConcept;

public class Car {

	String name;
	int price;
	String color;
	double mileage;
	
	public Car(String name, int price, String color, double mileage) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.mileage = mileage;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public Car(String name, int price, double mileage) {
		this.name = name;
		this.price = price;
		this.mileage = mileage;
	}
	
	
	
	
}
