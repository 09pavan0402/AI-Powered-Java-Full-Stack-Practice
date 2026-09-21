package com.flm.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsPractice {

	public static void main(String[] args) {
		Map<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(1, "pavan");
		map2.put(2, "mohan");
		System.out.println(map2.get(1));
		System.out.println(map2.get(4));
		//3ways to retrive map
		//keyset
		//values
		//entry set
		Set<Integer> keys=map2.keySet();
		
		for(Integer key: keys) {
			System.out.println(key + " = "+ map2.get(key));
		}
		System.out.println("================");
		Collection<String> values=map2.values();
		System.out.println(values);
		System.out.println("================");
		Set<Entry<Integer, String>> entrySet=map2.entrySet();
		for(Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("================");
		Iterator<Entry<Integer, String>> iterator=map2.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry=iterator.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	private static void practice() {
		Map map=new HashMap();
		map.put(1, "Laxmi");
		map.put(2, "ballu");
		map.put(3, "gopal");
		map.put("ramu", 12);
		map.put('A', 65);
		map.put(4, "ballu");
		map.put(4, "banu");
		map.put(null, "mouli");
		map.put(null, "mohan");
		System.out.println(map);
	}
	
}
