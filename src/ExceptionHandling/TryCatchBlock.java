package ExceptionHandling;

public class TryCatchBlock {
	
	//single try block is not allowed
	//try..finally is allowed
	//try..catch...catch..finally
	

	String name= "Java";
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj= new TryCatchBlock();
		obj=null;
		
		try {
			
				System.out.println(obj.name);
				int i=9/0;
				System.out.println("testing..");
				System.out.println("testing..");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is coming...");
			//e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("NPE is coming...");
			//e.printStackTrace();
		}
		finally { // does not matter exception coming or not finally blocks will be executed
			System.out.println("inside finally block...");
			System.out.println("Disconnect with DB...");
		}
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
