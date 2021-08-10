package OOP_Interface;

public interface USMedical extends WHO {
	
	int min_fees= 10;
	
	//Interface variables are static and final by default 
	
	//Abstract method: A method which does not have any method body 
	//prototype methods
	//no method body- only method declaration for non static methods
	
	//can not create the object of Interface
	
	
	public void physioServices();
	
	public void cardioServices();
	
	public void emergencyServices();
	
	public void services_911();
	
	public String getPatientDetails();
	
	//After JDK 1.8:
	//1.We can have static methods in Interface with the method body

	public static void billing() {
		System.out.println("US--billing system");
	}

	//2.we can create default method:
	default void ambulanceServices() {
		System.out.println("USMedical---ambulanceServices" +10000);
	}
}
