package ConstructorConcept;

public class Login {
	
	//Interview Question
	//What is the difference between Constructor and function
	//1.Function name can be anything but constructor name remain same as the class name
	//2.function may or may not return a value but constructor will never return value
	//3.function can be static or non static but constructor is always non static
	//4.function will be called by using object reference but constructor will be called when we create a object
	//5.function will define the class behavior or actions but Constructor will help to initialize the class variable  
	// Both functions and constructors are overloaded 
	
	String Username;
	String pwd;
	String role;
	
	public Login(String username, String pwd, String role) {
		this.Username = username;
		this.pwd = pwd;
		this.role = role;
	}

	public Login(String username, String pwd) {
		this.Username = username;
		this.pwd = pwd;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with"+ un+ " and"+pwd);
	}

	public void doLogin(String un, String pwd, String role) {
		System.out.println("login with"+ un+ " and"+pwd+ "and"+role);
	}

}
