package OOP_Inheritance;

public class LoginPage extends Page {
	
	//super keyword:
	//super keyword is used to call super class variables and methods 
	//also used to call super class constructor
	//super keyword should be the first statement inside constructor
	
	int timeOut= 20;
	public LoginPage(int p) {
		super(p);
		System.out.println("Login Page---default const");
	}
	@Override
	public void title() {
		System.out.println("LoginPage class-- title method");
	}

	
	
	public void display() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
		title();
		super.title();
	}
	
	public static void main(String[] args) {
		LoginPage lp= new LoginPage(100);
		lp.display();
	}

}
