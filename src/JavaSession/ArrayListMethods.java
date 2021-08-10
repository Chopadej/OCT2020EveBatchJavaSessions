package JavaSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListMethods {

	public static void main(String[] args) {
		//ArrayList is not synchronized 
		//Synchronized means multiple thread access the object at the same time and multiple thread fetch the values 
		// on different segments
		// In the synchronized environment at a time one thread can access the object other thread they have to wait outside
		// So, non synchronized is faster than synchronized
		// So array list is non synchronized means it is not thread-safe- that means any thread can come and write the value
		
		//Vector class: introduced in JDK 1.0 (Legacy class)
		//this vector class is synchronized class
		
		Vector<String> empName= new Vector<String>();
		
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(10);
		ar.add(2);
		ar.add(40);
		ar.add(1);
		ar.add(45);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		
		
		ArrayList<Integer> marks= new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		ar.addAll(marks);
		System.out.println(ar);
		
		// Very important concept: 
		// As we know Array List is non synchronized, not thread safe so what we need to make it synchronized or 
		//thread safe so simple use Collections.synchronizedList() method
		 
		List<Integer> ar1=	Collections.synchronizedList(ar);

	}

}
