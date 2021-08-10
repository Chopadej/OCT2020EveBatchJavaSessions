package JavaSession;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//ArrayList- Integer Type of data- That is we have restricted ArrayList to accept only Integer type of data only
		ArrayList<Integer> marks= new ArrayList<Integer>();
		
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);
		System.out.println(marks.size());
		
		for(Integer e: marks) {
			System.out.println(e);
		}
		System.out.println("_______");
		//JDK 8 streams: with lambda
		marks.stream().forEach(ele->System.out.println(ele));
		
		
		ArrayList<String> empList= new ArrayList<String>();

		empList.add("Tom");
		empList.add("Peter");
		empList.add("Lisa");
		System.out.println(empList.size());
		
		for(String s: empList) {
			System.out.println(s);
		}
		
		empList.stream().forEach(ele->System.out.println(ele));
		
		
		
		//Crate an ArrayList which stores an emp details:
		
		ArrayList<Object> empData= new ArrayList<Object>();
		empData.add("Tom");
		empData.add(25);
		empData.add(34.33);
		empData.add('m');
		empData.add(true);
		System.out.println(empData.size());
		
		for(Object e: empData) {
			System.out.println(e);
		}
		
		
		
		// Interview questions:
		//what are the different ways of iterating an ArrayList?
		//Ans-> for loop, for each loop, using Iterator and JDK 8 streams
		
		
		
		
	}

}
