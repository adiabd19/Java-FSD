package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer, String>();
		
		map.put(1, "Aditya");
		map.put(2, "Dilip");
		
		map.put(3, "ALex");
		
		map.put(4, null);
		map.put(null, "Mishra");
		
		map.put(5, "Aditya");
		
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		
		System.out.println("Get element at key 5: "+map.get(5));
		
		System.out.println("Get element at key 4: "+map.get(4));
		
System.out.println("Get element at key null: "+map.get(null));
		
		System.out.println("Get element at key 6: "+map.get(6));
		
		
		map.remove(5);
		
		System.out.println(map);
		
		
		for (Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+ " , "+m.getValue());
		}
		
		
	}

}
		
