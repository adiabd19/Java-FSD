package exceptionhandling;

import java.util.Scanner;

public class Handling {

	public static void main(String[] args) {
		 
		String a="A";
		int number;
		
	     
 
			try {
				
				
				number=Integer.parseInt(a);
				System.out.println("Number is "+number);
			}
			catch (Exception e) {
				
				System.out.println("Exception Occured: "+e);
			}
				  
		
}

}
