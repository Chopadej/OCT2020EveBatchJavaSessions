package OOP_Encapsulation;


//POJO class: plain Old Java Object
public class Login {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String un , String pwd) {
		System.out.println("Login with :" +un + "and "+ pwd);
	}

}
