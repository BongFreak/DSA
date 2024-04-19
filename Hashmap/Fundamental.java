package Hashmap;

import java.util.HashMap;

public class Fundamental {
	

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);
		System.out.println(map.keySet());
//		[a, b, c, d]
		
		System.out.println(map);
//		{a=10, b=20, c=30, d=40}
		
		System.out.println(map.get("a"));
//		10
		
		System.out.println(map.size());
//		4
		
		System.out.println(map.isEmpty());
//		false
		
		System.out.println(map.getOrDefault("a", 0));
//		10
		
		System.out.println(map.getOrDefault("e", 0));
//		0
		
		for(String s : map.keySet()) {
			System.out.println(s+" "+map.get(s));
		}
//		a 10
//		b 20
//		c 30
//		d 40

		
	}

}
