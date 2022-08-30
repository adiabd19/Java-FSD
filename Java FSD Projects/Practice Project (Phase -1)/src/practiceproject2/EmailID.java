package practiceproject2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailID {

	 public static void main(String[] args) {
	        
		 Scanner in=new Scanner(System.in);
	        ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("aditya.mishra@gmail.com");
	        emailID.add("rohit.mishra@gmail.com.com");
	        emailID.add("puja.singh@gmail.com.com");
	        emailID.add("aarti.devi@gmail.com.com");
	        emailID.add("mukesh.ambani@gmail.com");
	        emailID.add("virat.kohli@gmail.com");
	        emailID.add("ms.dhoni@gmail.com");
	        int i;
	   
	        String searcElement =in.nextLine();
	        
	                for(i=0; i<emailID.size(); i++)
	                {
	                    System.out.println(emailID.get(i));
	                    
	                    if(searcElement.equals(emailID.get(i))) {
	                        
	                        System.out.println("\n");
	                        
	                        System.out.println("email ID--" + searcElement + "--found");
	                        
	                        
	                      break;
	                        
	                    }
	                }

	    }
}

	
