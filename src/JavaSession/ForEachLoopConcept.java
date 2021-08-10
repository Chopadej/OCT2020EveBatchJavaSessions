package JavaSession;

public class ForEachLoopConcept {

	public static void main(String[] args) {
		int i[]= new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;

		
		//Typical for loop
		for(int p=0; p<i.length;p++) {
			System.out.println(i[p]);
			
			if(i[p]==20) {
				System.out.println("Hey 20 is found...");
			}
		}
	// Time complexity for typical for loop is: O(N)
	
	//for each loop
	for( int e: i) {
		System.out.println(e);
		if(e==20) {
			System.out.println("Hey 20 is found...");
		}
	}
	// Time complexity for each loop is: O(N)
	// Difference between typical for loop and for each loop is that: In for each loop there is less chances 
	// of programmer mistake compare to typical for loop, like IndexOutOfBound error 

	String student[]= new String[3];
	student[0]= "Tom";
	student[1]= "Lisa";
	student[2]= "Peter";
	
	for(String e: student) {
		System.out.println(e);
	} // Time complexity for typical for loop is: O(N)
	
	
	Object ob[]= new Object[5];
	ob[0]= "Tom";
	ob[1]= 30;
	ob[2]= 35.44;
	ob[3]= true;
	ob[4]= 'm';
	
	for(Object t: ob) {
		System.out.println(t);
	}
}
}
