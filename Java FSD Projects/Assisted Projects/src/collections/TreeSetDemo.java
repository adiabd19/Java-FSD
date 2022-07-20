package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(); 
		
		set.add("Banana");
		set.add("Cherry");
		set.add("Almond");
		set.add("Apple");
		
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Banana"));
	
	 
		
	}

}
