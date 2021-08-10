package JavaSession;

public class StringConcat {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "World";

		int a = 100; 
		int b = 200;

		double c = 12.33;
		double d = 23.44;

		System.out.println(a+b); // In primitive data types '+' operator acts like addition 
		System.out.println(c+d); // In primitive data types '+' operator acts like addition 
		System.out.println(x+y); // In String it behaves like concatenations that means merging of two strings

		System.out.println(a+b+x+y);//300HelloWorld

		System.out.println(x+y+a+b);//HelloWorld100200

		System.out.println(x+y+ (a+b));//HelloWorld300

		System.out.println(x+y+c+d);//HelloWOrld12.3323.44

		System.out.println((a+b+x+y+c+d));//300HelloWorld12.3323.44

		System.out.println((x+y+a+b+c+d));//HelloWorld10020012.3323.44

		System.out.println("The value of a is:" +a);
		System.out.println("The value of b is:" +b);
		System.out.println("The sum of a and  b is:" +(a+b));

		int total = 1000;
		int tax = 50;
		int balance = 100;
		System.out.println("The Gross amount is :"+(total + tax -balance));

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1+c2); //195 Ascii value because it is addition of character

		System.out.println(x+y+c1+c2);//HelloWorldab

		System.out.println(x+y+(c1+c2));//HelloWorld195
	}

}




