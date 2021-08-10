package JavaSession;

public class FunctionsInJava {

	//Functions:
	//Can not create function inside function 
	//Function is the behavior of the class
	// main method is also a function so we can not write function inside main 
	
	//1. No input and No return:
	//void- function can not return anything.. can not have return keyword 
	public void test() { //0 param function
		System.out.println(" test function");
	}
	
	//2. No input and some return
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name= "Naveen";
		return name;
	}
	public int getTotal() {
		System.out.println("get total");
		int a= 100;
		int b= 200;
		int c= a+b+30;
		return c;
		
	}
	
	//3. some input and some return
	public int add(int a, int b) {
		System.out.println("add function");
		int z= a+b;
		return z;
	}
	
	//Function - which takes country name as a parameter and returns capital name
	public String getCapitalName(String countryName) {
		System.out.println("getting the capital for"+ countryName);
		
		if(countryName.equals("India")) {
			return "New Dehli";
		}
		if(countryName.equals("US")) {
			return "Washington DC";
		}
		if(countryName.equals("Russia")) {
			return "Moscow";
		}
		if(countryName.equals("UK")) {
			return "London";
		}
		else {
			System.out.println("Country name is not found, please pass the right country name"+ countryName);
			return null;
		}
	}
	
	//Function: which takes studentName(String) and returns their marks(int)
	
	//Appproach 1:
	
	/*public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student :"+studentName);
		if(studentName.equals("Suma")) {
			return 90;
		}
		else if(studentName.equals("Vishal")) {
			return 100;
		}
		else if(studentName.equals("Jasvir")) {
			return 95;
		}
		else if(studentName.equals("Naveen")) {
			return 20;
		}
		else {
			System.out.println("student not found: "+studentName);
			return -1;
		}*/
		
	//Appproach 2:
	
		public int getStudentMarks(String studentName) {
			System.out.println("getting marks for student :"+studentName);
			int marks =0;
			if(studentName.equals("Suma")) {
				marks= 90;
			}
			else if(studentName.equals("Vishal")) {
				marks= 95;
			}
			else if(studentName.equals("Jasvir")) {
				marks= 80;
			}
			else if(studentName.equals("Naveen")) {
				marks=20;
			}
			else {
				System.out.println("student not found: "+studentName);
				return -1;
			}
			return marks;
	}
	
		//function: which takes browsername(String) and launches the browser accordingly
		//return type: void
		public void launchBrowser(String brName) {
			if (brName.equals("chrome")){
				System.out.println("chrome launched");
			}
			else if( brName.equals("firefox")){
				System.out.println("ff launched");
			}
			else {
				System.out.println("browser not found: "+ brName);
			}
		}
		
	
	public static void main(String[] args) { 
	// main method can not have return statement because main method does not return anything thats why it is void in nature
	//Main method static in nature : because main method is never a part of the object or it does not define the behavior of the
	// class also it just for program execution thats why JVM check the exact signiture that why main method is by default
	//static in nature
	//Why public: because JVM can easily access any method thats why it is publicaly define
	//String[] args: input parameter that is one String array parameter 	
		
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		String n = obj.getTrainerName();
		System.out.println(n);
		int total= obj.getTotal();
		System.out.println(total);
		System.out.println(obj.getTotal());// also be valid 
		
		int t1= obj.add(10, 20);
		System.out.println(t1);
		
		int t2= obj.add(30, 40);
		System.out.println(t2);
		
		String cap1= obj.getCapitalName("India");
		System.out.println(cap1);
		
		int m1= obj.getStudentMarks("Suma");
		System.out.println(m1);
		obj.launchBrowser("chrome");

	}

}
