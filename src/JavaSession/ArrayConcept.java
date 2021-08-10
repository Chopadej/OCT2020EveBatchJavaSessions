package JavaSession;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array
		// Two major limitations:
		//1. Size is fixed, thats why it is called static array,(static array should't be use when data is dynamic)
		//Example-> e-commerce application 
		// If we use static array in e-commerce application like amazon and listed the product like 50 but during festival
		//season need to increase the product up to 500, so unable to add the product in static array 
		// where we should use this static array then?
		//Ans-> Total number of student in a class or Bus capacity or movie theatere capacity, total number of month in a year,
		// fight seating, train seating 
		// static array size is fixed so to overcome with this issue, we use dynamic array (Array List)
		
		//2. Static array stores similar types of data:to overcome with this issue, we use object array (but this is also static array
		//so we can use ArrayList with Generics
		
		
		//1.int array
		int i[]=new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundException
		
		int len = i.length;
		System.out.println("len "+ len);
		System.out.println("Hi "+ (len-1));
		System.out.println("Li "+ 0);
		
		//To print all the values of arrays
		for(int k=0; k<4; k++) {
			System.out.println(i[k]);
			
			
			//double array
			
			double d[]= new double[2];
			d[0]= 12.33;
			d[1]= 34.33;
			
		System.out.println(d[0]+d[1]);
		
		//char array
		char c[]= new char[3];
		c[0]= 'a';
		c[1]= 'b';
		c[2]= '$';
		System.out.println(c[0]+ c[1]);
		
		//String array
		
		String student[]= new String[3];
		student[0]= "Tom";
		student[1]= "Lisa";
		student[2]= "Peter";
		
		for(int m=0; m<student.length; m++) {
			System.out.println(student[m]);
		}	
		// Both for loop functions the same
		for(int m=0; m<=student.length-1; m++) {
				System.out.println(student[m]);
		}
		
		//Object Array: Used to store different types of data
		
		Object ob[]= new Object[5];
		ob[0]= "Tom";
		ob[1]= 30;
		ob[2]= 35.44;
		ob[3]= true;
		ob[4]= 'm';
		
		for(int g=0; g<ob.length; g++) {
			System.out.println(ob[g]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		}
	}

}
