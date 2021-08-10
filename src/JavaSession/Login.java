package JavaSession;

public class Login {
	
	//Duplicate function names are not allowed 
	//Method overloading: part of OOP- compile time Poly+Morphism 
	//Within the same class, if we have multiple methods with  the same name but
	//1.different parameter
	//2.Sequence of the parameter is also different 
	
	// Important interview question
	//Why we do method overloading:
	//Method overloading is not a compulsory but it is a coding standard we have to follow
	// for programmer point of view- it is very flexible 
	
	public void doLogin() {// 0 param	
	}
	
	public void doLogin(int a) {//1- param	
	}
	
	public void doLogin(int a, int b) {//2- param	
	}
	public void doLogin(int a, String b) {//2- param	
	}
	public void doLogin(String a, int b) {//2- param	
	}
	
	//Login feature overloading 
	public void login() {
		System.out.println("login with no parameter");
	}
	public void login(String un, String pwd) {
		System.out.println("login with 2-parameter "+ un+pwd);	
	}
	public void login(String un, String pwd, String role) {
		System.out.println("login with 3-parameter"+ un+pwd+role);	
	}
	public void login(String un, String pwd, int otp) {
		System.out.println("login with 3-parameter"+ un+pwd+otp);	
	}
	public void login(String un, String pwd, long phone) {
		System.out.println("login with 3-parameter "+ un+pwd+phone);	
	}
	public boolean login(long phone, int otp) {
		System.out.println("login with phone and otp");
		return true;
	}
	
	//
	public void search() {
		
	}
	public void search(String name) {
		
	}
	public void search(String name, int price) {
		
	}
	public void search(String name, int price, String color) {
		
	}
	
	//
	public void doPayment(String AmazonPay, String pwd, int otp) {
		
	}
	public void doPayment(long CC, int cvv) {
		
	}
	public void doPayment(String UPI, long phone, int otp) {
		
	}
	
	//
	public void cabBooking() {
		
	}
	public void cabBooking(String st, String end, String carType) {
		
	}
	public void cabBooking(String st, String end, String carType, String couponCode) {
		
	}
	
	
	public static void main(String[] args) {
		Login lp= new Login();
		lp.login();
		lp.login("admin", "admin123");
		lp.login("naveen", "naveen123", 989000);
		if(lp.login(98900, 1234)) {
			System.out.println("home page is displayed");
		}

		
	}

}
