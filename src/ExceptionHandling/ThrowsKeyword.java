package ExceptionHandling;

public class ThrowsKeyword {
	
	public void m1() throws ArithmeticException{
		m2();
	}

	public void m2() throws ArithmeticException{
		m3();
	}
	
	// throws keyword is used after the method name 
	//throws keyword will not handle the exception it just pass the exception from one method to another
	
	public void m3() throws ArithmeticException{
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is coming...");
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args)  {
		
		ThrowsKeyword obj= new ThrowsKeyword();
		
			obj.m1();
	
			
	}

}
