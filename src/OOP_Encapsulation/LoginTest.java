package OOP_Encapsulation;

public class LoginTest {

	public static void main(String[] args) {

		Login lp= new Login();
		
		lp.setUsername("Tom@gmail.com");
		lp.setPassword("test123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		
		lp.setUsername("seller@gmail.com");
		lp.setPassword("seller123");
		
		lp.doLogin(lp.getUsername(), lp.getPassword());
		

	}

}
