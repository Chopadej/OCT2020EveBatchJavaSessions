package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp= new LoginPage();
		lp.title();
		lp.header();
		lp.url();
		lp.doLogin();
		lp.timeOut();
		lp.logo();
		Page.pageColor();// static method called 
		
		//top casting: child class object can be reffered by parent abstract class referance variable 
		
		Page p =new LoginPage();
		p.title();
		p.header();
		p.url();
		p.timeOut();
		
		//down casting: Not possible because Parent class object (here abstract class) object can not be created

	}

}
