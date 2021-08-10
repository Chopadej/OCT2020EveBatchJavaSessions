package JavaSession;

public class Users {
	
	String name;
	int age;
	static String compName;
	
	public void getCity() {
		System.out.println("get city ");
	}
	
	//Can we overload static method- Yes, we can overload
	
	public static void getInfo() {
		System.out.println("get info ");
	}
	

	public static void getInfo(int a) {
		System.out.println("get info "+ a);
	}
	
	public static void getInfo(int a, String b) {
		System.out.println("get info "+ a + b);
	}


	public static void main(String[] args) {
		//how to call non static variables and methods
		//we have to create the objects:
		
		Users obj= new Users();
		obj.name= "peter";
		obj.age= 25;
		obj.getCity();
		
		//how to call non static variables and methods
		//1. call them directly within the same class
		
		compName= "HCL";
		getInfo();
		getInfo(10);
		
		

	}

}
