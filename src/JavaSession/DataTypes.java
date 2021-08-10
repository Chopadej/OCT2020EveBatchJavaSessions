package JavaSession;

public class DataTypes {

	public static void main(String[] args) {
		// Data Type: Types of Data
				// Java is a statically typed or strongly types language: C, C++, Java

				// types:
				// 1. Primitive Data Type
					// a. Boolean Type : true/ false
						// b. Numeric Type
							// b1. character : char
							// b2. Integral values:
							// 1. Integral : byte, short, int, long
							// 2. Floating point: float, double
				// 2. Non- primitive data types: String, Arrays, Interface, class,
				// objects etc...

				// byte
				// Size: 1 byte =8 bits
				// range: -128 to 127
				byte b = 10;
				b = 20;
				byte b1 = 100;
				byte b2 = 0;
				byte b3 = -10;
				// byte b4= 200;
				byte age = 30;
				
				System.out.println(b);
				System.out.println(age);
				System.out.println(age+b1);

				//short
				//size: 2 bytes= 16 bits
				//range: -32768 to 32767
				
				short s= 100;
				short s1= 34; 
				short s2= -10;
				System.out.println(s1);
				
				//int 
				//size: 4 bytes: 32 bits
				//range: -2147483648 to 2147483647
				int i= 100;
				int i1=-90;
				int k = 1000;
				int distance = 100000; 
				System.out.println(distance);
				System.out.println(i+s1);
				
				//long 
				//size: 8 bytes = 64 bits
				//range:
				
				
				
				//float
				//size: 4 bytes: 32 bits
				//range: after . it may take up to 7 digits
				
				float f1= 12.33f;
				//or
				float f= (float)45.44;
				float f2= 100; //100.0
				System.out.println(f2);
				
				
				//double 
				//size: 8 bytes: 64 bits
				//range:  after . it may take up to 16 digits
				double d= 12.334;
				double d1= 1000;
				
				//char: only single digits within single quotes
				//size: 2 bytes: 16 bits 
				// But in C and C++ it takes only 1 byte but in java it takes 2 bytes because in java all the unicode
				// characters are allowed means Latin American or Chinese characters are allowed in java
				
				//range:
				char c='a'; //a-z
				char c1='1';//0-9
				char c11='b';
				char c2='$';
				char gender = 'm';
				char currency = '$';
				System.out.println(c);
				System.out.println(gender);
				System.out.println(currency);
				System.out.println(c+c11);
				
				//boolean 
				//Size:0.999 bits arround 1 bits (Less than 1 bit)
				//range:
				boolean bl= true; 
				boolean bl2= false;
				
				//String 
				String str = "Hello World";
				String str1= "Testing";
				String str2 = "100";
				System.out.println(str);
				System.out.println(str+str1);
				System.out.println(10+10);
				System.out.println(20/10);
				
				System.out.println(4/2);//2
				System.out.println(5/2);//2
				System.out.println(5.0/2);//2.5
				System.out.println(5/2.0);//2.5
				System.out.println(5.0/2.0);//2.5
				
				
	}

}
