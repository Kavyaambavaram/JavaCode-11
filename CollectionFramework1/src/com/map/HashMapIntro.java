package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// add
		map.put("Sridhar", 22);
		map.put("Likhith", 23);
		map.put("Amogh", 23);
		map.put("Chida", 22);
		map.put("Pavan", 21);
		
		System.out.println(map); // Doesn't maintain insertion order
		
		// duplicates : Key cannot be duplicate but value can be duplicate
		// if we add key which is already exist then the value will get updated
		
		map.put("Pavan", 22);
		System.out.println(map);
		
		//null values
		map.put(null, 10);
		System.out.println(map);
		
		// traverse
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			// print only keys: getKey();
//			System.out.println(entry.getKey());
			
			// print only values: getValue();
//			System.out.println(entry.getValue());
			
			// print both key and value
			System.out.println(entry.getKey()+" ------->"+entry.getValue());
		}
		
		// check key then print value
		if(map.containsKey("Sridhar")) {
			System.out.println(map.get("Sridhar"));
		}
		
		// get key if value is present
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()==23) {
				System.out.println(entry.getKey());
			}
		}
		
		// remove
		if(map.containsKey(null)) {
			System.out.println(map.remove(null));
		}
		System.out.println(map);

	}

}