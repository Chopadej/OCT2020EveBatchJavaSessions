package JavaSession;

import java.util.ArrayList;

public class ProductAccess {

	public static void main(String[] args) {
		

		ArrayList<String>laptopSellerList= new ArrayList<>();
		
		laptopSellerList.add("Xeon Enterprise");
		laptopSellerList.add("Neon IT Labs Enterprise");
		laptopSellerList.add("Imagine Pvt Ltd ");
		laptopSellerList.add("XYZ software");
		
		Product macbookProduct= new Product(); 
		macbookProduct.name= "Apple Macbook Pro";
		macbookProduct.id=101;
		macbookProduct.sellerList= laptopSellerList;
		
		Product windowsLaptop= new Product(); 
		windowsLaptop.name= "Thinkpad";
		windowsLaptop.id=102;
		windowsLaptop.sellerList= laptopSellerList;		
		
		
		System.out.println(macbookProduct.name);
		System.out.println(macbookProduct.id);
		System.out.println(macbookProduct.sellerList);
		
		System.out.println(windowsLaptop.name);
		System.out.println(windowsLaptop.id);
		System.out.println(windowsLaptop.sellerList);
	}

}
