package JavaSession;

public class Department {
	
	//Very Important
	//1. Non static area-> non static method= direct call
	//2.Non static area-> static method= Class name
	//3. Static area-> Static method= Class name (recommended) or direct 
	//4. Static area-> non static method-> Object 

	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		m4();
	}
	
	public void m4() {
		System.out.println("m4 method");
		Department.t1();
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {
		Department obj= new Department();
		obj.m1();
		Department.t1();

	}

}
