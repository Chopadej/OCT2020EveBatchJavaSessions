package OOP_Abstract;

public abstract class Page {
	
	public Page() {
		System.out.println("Page---default constructor");
	}
	
	//Partial abstraction:
	// we can achieve 0-100% abstraction with abstract class
	//But in interface- 100% abstraction is possible 
	
	//abstract class: can not create object
	//abstract class can have abstract methods and non abstract methods
	// can have final method also
	// we can create the constructor of abstract class but we can not create the object of abstract class 
	// but abstract class constructor will be called when we create the object of child class of abstract class
	
	public abstract void title();
	public abstract void header(); 
	public abstract void url();
	
	public void timeOut() {
		System.out.println("Page---timeOut");
	}
	
	public final void logo() {  // can not be overridden
		System.out.println("Page---logo");
	}
	
	public static void pageColor() { // can not be overridden
		System.out.println("page---pageColor");
	}

}
