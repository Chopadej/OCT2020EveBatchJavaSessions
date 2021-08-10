package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LoginPage--constractor");
	}
		

	@Override
	public void title() {
		System.out.println("LoginPage---Title");
		
	}

	@Override
	public void header() {
		System.out.println("LoginPage---header");
		
	}

	@Override
	public void url() {
		System.out.println("LoginPage---url");
		
	}
	
	public void doLogin() {
		System.out.println("LoginPage---doLogin");
	}

}
