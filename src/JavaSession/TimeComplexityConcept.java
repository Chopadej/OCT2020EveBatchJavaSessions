package JavaSession;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		//Time Complexity
		// Is basically called as unit to check the how efficient or optimized code you have written to measure the performance
		//of your code
		//Code efficiency
		//Code Optimization
		// It could be O(1), O(n), O(n^2) -> Big O
		// Time Complexity: O(n) --> Big O

				int i = 1;
				System.out.println(i);
				// constant time -- once --> O(1)

				System.out.println(1 + 2 + 3 + 4);// O(1)

				int a = 10;
				int b = a + 10;
				int c = a + b;
				System.out.println(c);
				// O(1)

				// 1 to 10: --> O(100) -> o(n)
				for (int k = 1; k <= 10; k++) {
					System.out.println(k);
				}

				// 1+ n + n + n => 1+3n => 3n=> n ==> O(n) -- Linear equation

				for (int m = 1; m <= 10; m++) {

					for (int n = 1; n <= 10; n++) {

						System.out.println(m + "" + n);
					}

				}

				// (1+n+n)(1+n+n) ==> (1+2n)(1+2n)=> 1+2n+2n+4n^2 ==> 1+4n+4n^2 ==> 4n^2+4n+1
				// ==>4n^2+4n=> 4(n^2+n)
				// ==> n^2+n ==>n(n+1)=> n^2 ==> O(n^2)
				
//				for() {
//					for() {
//						for() {
//							
//						}
//					}
//				}

	}

}
