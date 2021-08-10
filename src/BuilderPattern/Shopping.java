package BuilderPattern;

public class Shopping {

	public static void main(String[] args) {


		AmazonApp shop= new AmazonApp();
		
		shop.doLogin("Tom@gmail.com", "tom@123")
		.search("Apple Macbook Pro")
		.addToCart("Apple Macbook Pro")
		.doPayment("1233 3344 2344", 900)
		.logout();
			
		System.out.println("-----------------");
		
		shop.doLogin("Tom@gmail.com", "tom@123")
		.addToCart("Samsang S10")
		.doPayment("12334@Hdfc")
		.logout();
		

		System.out.println("-----------------");
		shop.doLogin(98908678, 1234)
		.logout();
		
		System.out.println("-----------------");
		
		shop.doLogin(98908678, 1234)
		.doPayment("12334@Hdfc")
		.logout();
		
		System.out.println("END...");
		
		
	}

}
