package JavaSession;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// ArrayList- Default class
		//dynamic in nature
		//It maintains order- It stores the values sequentially 
		//sequential index based collection
		//It internally using concept of resizeable array only
		
		ArrayList ar= new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());//2
		
		// For array we use .length() method to get the length of the array
		// for ArrayList we use.size() method to get the lenght of the ArrayList
		
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());//4
		
		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		System.out.println(ar.size());//7
		
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(4));
		//System.out.println(ar.get(7));//IndexOutOfBoundException
		//System.out.println(ar.get(-1));//IndexOutOfBoundException
		
		ar.remove(4);
		System.out.println(ar.get(4));
		
		//to print all the values from ArrayList
		System.out.println(ar);

		//for loop
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		ar.add(12.33);
		ar.add("tom");
		
		//for each loop
		for(Object e: ar) {
			System.out.println(e);
		}
		
		//using iterator
		Iterator it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
