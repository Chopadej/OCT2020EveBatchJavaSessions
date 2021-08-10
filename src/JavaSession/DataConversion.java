package JavaSession;

public class DataConversion {

	public static void main(String[] args) {


		String x= "100";
		System.out.println(x+20);
		//120
		
		//String to int:
		//wrapper class:Interger, Double, Boolean
		
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		String total= "1000";
		int finalTotal= Integer.parseInt(total) + 10 + 40 -30;
		System.out.println(finalTotal);
		
		
		//String to double
		
		String y= "12.33";
		System.out.println(y+20);
		
		double d=Double.parseDouble(y);
		System.out.println(d+20);
		
		
		/*String p="100A";
		int m= Integer.parseInt(p);
		System.out.println(m+20); //java.lang.NumberFormatException */
		
		//int to String:
		//double to String
		
		int h= 100;
		System.out.println(h+20);
		
		String h1= String.valueOf(h);//"100"
		System.out.println(h1+20);
		
		double k= 12.33;
		String k1= String.valueOf(k);
		System.out.println(k1+90);
		
		

}
}
