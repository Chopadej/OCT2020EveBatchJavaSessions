package BuilderPattern;

public class AmazonApp {
	
	// Different use cases of this keyword
	//1. Used in the constructor
	//2. Used in setter and getter method
	//3.Used in the method as well 
	//  return this;  this statement returning current class objects, it is equivalent to new AmazonApp()
	
	public AmazonApp doLogin(String un, String pwd) {
		System.out.println("Login with:"+un + " "+pwd);
		return this; 
	}
	
	public AmazonApp doLogin(long phone, int otp) {
		System.out.println("Login with:"+phone + " "+otp);
		return this;
	}
	
	public AmazonApp search(String productName) {
		System.out.println("Search product with :" +productName);
		return this;
	}
	
	public AmazonApp search(String productName, int price) {
		System.out.println("Search product with :" +productName+ " "+price);
		return this;
	}
	
	public AmazonApp addToCart(String productName) {
		System.out.println("Add to cart: "+productName);
		return this;
	}
	
	public AmazonApp doPayment(String cc, int cvv) {
		System.out.println("make the Payment with" +cc+ " "+cvv);
		return this;
	}
	
	public AmazonApp doPayment(String upi) {
		System.out.println("make the Payment with" +upi);
		return this;
	}
	
	public AmazonApp logout() {
		System.out.println("Logout from this application");
		return this;
	}


}
