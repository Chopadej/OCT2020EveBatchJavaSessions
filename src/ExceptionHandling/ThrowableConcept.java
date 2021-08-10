package ExceptionHandling;

public class ThrowableConcept {
	
	//Throwable class is super class of Exception

	public static void main(String[] args) {
		
		System.out.println("launch the browser");
		
		System.out.println("Enter the URL");
		
		try {
			int i=9/0;
		}
		catch(Throwable e) {
			System.out.println("Some Exception is coming...");
			e.printStackTrace();
			
			
		}

	}

}
