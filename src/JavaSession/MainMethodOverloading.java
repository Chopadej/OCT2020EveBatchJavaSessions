package JavaSession;

public class MainMethodOverloading {
	
	// Yes, it is possible to overload the main method but JVM will always look into the correct signiture
	// of the main method that is one string array arguments String[] args

	public static void main(String[] args) {
		System.out.println("Hello world ");
		main(10);
		main(10, 20);
		
	}
	
	public static void main(int a) {
		System.out.println("Hello world" +a);
	}

	public static void main(int a, int b) {
		System.out.println("Hello world "+ a+b);
	}


}
