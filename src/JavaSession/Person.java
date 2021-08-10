package JavaSession;

public class Person {

	//Concept : Objects can be transfered or Multiple references can be pointing to single object
	
	//class variable or template of the class
	String name;
	int age;
	char gender;
			
	
	
	public static void main(String[] args) {
		Person p1= new Person();
		p1.name="Jasvir";
		p1.age= 25;
		p1.gender= 'm';
		
		Person p2= new Person();
		p2.name="Naveen";
		p2.age= 26;
		p2.gender= 'm';

		Person p3= new Person();
		p3.name="Lisa";
		p3.age= 30;
		p3.gender= 'f';
		
		System.out.println(p1.name+ " "+p1.age+ " "+p1.gender);
		System.out.println(p2.name+ " "+p2.age+ " "+p2.gender);
		System.out.println(p3.name+ " "+p3.age+ " "+p3.gender);
		
		// Very important interview questions
		p1 = p2;
		System.out.println(p1.name+ " "+p1.age+ " "+p1.gender);
		System.out.println(p2.name+ " "+p2.age+ " "+p2.gender);
		System.out.println(p3.name+ " "+p3.age+ " "+p3.gender);
		
		p2 = p3;
		System.out.println(p1.name+ " "+p1.age+ " "+p1.gender);
		System.out.println(p2.name+ " "+p2.age+ " "+p2.gender);
		System.out.println(p3.name+ " "+p3.age+ " "+p3.gender);
		
		p3 = p1;
		System.out.println(p1.name+ " "+p1.age+ " "+p1.gender);
		System.out.println(p2.name+ " "+p2.age+ " "+p2.gender);
		System.out.println(p3.name+ " "+p3.age+ " "+p3.gender);

	}

}
