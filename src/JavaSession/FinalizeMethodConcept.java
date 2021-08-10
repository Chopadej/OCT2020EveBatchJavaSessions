package JavaSession;

public class FinalizeMethodConcept {
	
	String name="Java";

	public static void main(String[] args) {

		//final int i= 10;
		//finally should be used with try

		FinalizeMethodConcept obj= new FinalizeMethodConcept();
		System.out.println(obj.name);
		
		obj=null;
		
		
		Employee e = new Employee();
		e=null;
		
		// Here after making e=null; and after calling System.gc() method, not calling the finalize method
		//because In Emplyoyee class we have not written finalize() method.
		
		System.gc();

	}
	// this method is available inside the object class
	//After executing System.gc method the finalize method will be called before destroying the objects
	
	@Override
	public void finalize() {
		System.out.println("Inside finalize method ");
		
	}
	
}
