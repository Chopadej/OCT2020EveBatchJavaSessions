package JavaSession;

public class Employee {

	//class variables: we never assign values to the class variable like String name= "Tom"; directly 
	String name;
	int age;
	double salary;
	char gender;
	boolean isPermanent;
	
	
	public static void main(String[] args) {
		
		//Class is a template which will define the behavior and properties and using this we can 
		//create number of object 
		
		//create object of the class: using new keyword
		
		Employee e1= new Employee();
		
		// Here new Employee(); that is RHS is the Object
		//e1 is the Object reference name
		// and type of the object reference is Employee Type
		
		//Whenever we create the Object it will be stored inside Heap memory 
		//Object references will always be stored inside stack memory 
		
		//Important concept
		// Heap memory is also divided into 3 sections
		//1. Young Generations- Object will always be stored inside Young Generation 
		//2.Survivor 1
		//2.Survivor 2
		// When we create the multiple objects and YG space is filled then object will be pushed into
		//Survior 1 and Survior 2 
		//But, sometimes Heap memory itself filled with objects and all the memory utilized then Garbage collectors 
		//comes into picture, but GC not called automatically JVM is responsible to called GC
		//GC will destroy the objects which has null references or No references
		//Java provide provision for programmer to called System.gc() method but it does not give guarantee that it will
		//call GC (it is just provision provided by JAVA), whenever we write system.gc() then java will send the instruction to JVM
		//then JVM sends instruction to GC 
		//in C language we use alloc() and malloc() methods for GC
		//in C++ language we have destructor and constructors are available
		
		e1.name= "Tom";
		e1.age= 25;
		e1.salary= 34.55;
		e1.gender='m';
		e1.isPermanent=true;
		
		Employee e2= new Employee();
		e2.name= "Lisa";
		e2.age= 30;
		e2.salary= 45.66;
		e2.gender='f';
		e2.isPermanent=false;
		
		System.out.println(e1.name+ " "+e1.age+ " "+e1.salary);
		System.out.println(e2.name+ " "+e2.gender+ " "+e2.isPermanent);

		Employee e3= new Employee();
		e3.name="Peter";
		e3.age= 35;
		System.out.println(e3.name+ " "+e3.age+ " "+e3.salary+ " "+e3.gender+ " "+e3.isPermanent);
		
		// here e3.salary e3.gender are showing their default values as we have not initialized their values.
		//default values of int: 0
		//default values of String: null
		//default values of boolean: false
		//default values of double: 0.0
		//default values of character: blank space
		
		Employee e4= new Employee();
		System.out.println(e4.name+ " "+e4.age);
		
		//we can create the object without reference name also but this is bad practice, these objects will be distroyed by GC
		//new Employee().name=" Steve";
		//new Employee().age= 25;
		//It is a good practice so we always create a object with their references
		
		
		//null reference - these types of objects are eligible for garbage collector
		Employee e5= new Employee();
		e5= null;
		e5.name= "Naveen";
		System.out.println(e5.name);// java.lang.NullPointerException because e5 is pointing to Null 
		
	}
	

	@Override
	public void finalize() {
		System.out.println("Inside finalize method.. for Employee class ");
		
	}

}
