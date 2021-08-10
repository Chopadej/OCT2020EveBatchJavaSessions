package JavaSession;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//Loops: To avoid the repetitive work 
		//While loop
		
		int i = 1;//starting: initialization
		while(i<=10)//COndiional
		{
			System.out.println(i);//statement
			i++;//increment, decrement 
		}

		int count= 1;
		while(count<=100)
		{
			System.out.println(count);
			if(count % 5 == 0)
			{
				System.out.println("Hello..!!");
			}
			count++;
		}
		System.out.println("-----------------");
		//for loop
		//1 to 10
		for(int k = 1; k<=10; k++)
		{
			System.out.println(k);
		}
		
		System.out.println("----------------");
		
		int k;
		for(k = 1; k<=10; )
		{
			System.out.println(k);
			k++;
		}
			
		//valid syntax: infinite loop
		/*for(;;)
		{
			System.out.println("Hi..");
		}*/
		
		System.out.println("-------a to z---------");
		for ( char s = 'a'; s<='z'; s++)
		{
			System.out.println(s);
		}
		
		for(double d = 1.0; d<=5.0; d++)
		{
			System.out.println(d);
		}
		
		// Want to print even number from 1 to 10
		
		for ( int even=2; even<=10; even=even+2) {
			System.out.println(even);
		}
		
		//Another way to print even number
		for ( int even=2; even<=10; even++) {
			System.out.println(even);
			even++;
		}
		
		
		System.out.println("**********************");
		//Want to print odd number from 1 to 10
		for(int odd=1; odd<=10;odd=odd+2) {
			System.out.println(odd);
		}
		//Another way to print odd number
		for(int odd=1; odd<=10;odd++) {
			System.out.println(odd);
			odd++;
		}

		/*What is the difference between while and do while loop?
			Syntax wise while loop says check the condition immediately and if condition is satisfied then allowed you to 
			execute the statements
	but do while loop says does not matter condition will come later first at least execute particular statement once 
*/
		
		
		//do- while loop 
		//print 1 to 10
		int p= 1;
		do {
			System.out.println(p);
			p++;
		} while (p<=10);
			
		
		//While infinite loop: Practical use of infinite loop is welcome board on Hotels, sensex board etc
	/*	while(true) {
			System.out.println("welcome");
		}
		*/
		//do while infinite loop
		int q= 1;
		do {
			System.out.println(q);
			q++;
		} while (true);
		}
		
	
	
	}


