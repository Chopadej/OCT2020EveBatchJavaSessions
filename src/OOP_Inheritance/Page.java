package OOP_Inheritance;

public class Page {
	
	int timeOut=10;
	
	public Page() {
		System.out.println("page class default const");
	}
	
	public Page(int i) {
		System.out.println("page class one param const"+ i);
	}
	public void title() {
		System.out.println("Page class-- title method");
	}
	
	public final void logo() { // This method will not be overriden as it is declared as final
		System.out.println("Page---- logo");
	}

}
