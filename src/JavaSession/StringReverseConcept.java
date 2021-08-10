package JavaSession;

public class StringReverseConcept {

	public static void main(String[] args) {
		
		String str= "Selenium"; //muineleS
		
		char arr[]= str.toCharArray();
		String rev= "";
		
		for(int p= arr.length-1; p>=0; p--) {
			rev= rev + str.charAt(p);
			
		}
		System.out.println(rev);
	}
// Time complexity:
	//worst case: O(n)
	//Best case: O(1)
	//Average case: O(n)
	
}
