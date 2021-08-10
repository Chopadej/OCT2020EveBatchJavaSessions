package JavaSession;

public class A {
	
	//Example of stack overflow error
	// When infinite calling happened between two methods at sometime we will get the stack overflow error.

	public static void main(String[] args) {
		System.out.println("A-- main");
		B.main(args);
	}

}
