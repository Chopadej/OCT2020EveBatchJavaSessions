package ConstructorConcept;

public class Employee {
	
	//Class variables
	String name;
	int id;
	int age;
	boolean isActive;
	
	// Constructor :
	// name will be same as the class name
	//Constructor overloading is allowed in java
	// Constructor will be called when we create the object
	// Constructor will help to initialize the class variable (non static ) for the respective object
	
	public Employee() { //0 param const
		System.out.println("0 param const...");
	}
	
	public Employee(int a) {// 1 param const
		System.out.println("0 param const..."+a);
	}
	
	public Employee(int a, String b) {//2 param const
		System.out.println("0 param const..."+a+b);
	}
	
	public Employee(String name, int id) {
		this.name= name;
		this.id= id;	
	}
	
	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Employee(String name, int id, int age, boolean isActive) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		
		Employee obj= new Employee(10, "java");
		Employee e1= new Employee("Tom", 101);
		System.out.println(e1.name + " "+e1.id);
		
		Employee e2= new Employee("Peter", 102, 30, true);
		System.out.println(e2.name+ " "+e2.id+ " "+ e2.age+ " " + e2.isActive);
	
		
		
	}

}
