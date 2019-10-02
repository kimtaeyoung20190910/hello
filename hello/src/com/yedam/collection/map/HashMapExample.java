package com.yedam.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김태영", 80);
		map.put("흥태영", 70);
		map.put("이태영", 60);
		map.put("강태영", 90);
		System.out.println("Entry갯수: " + map.size());
		System.out.println("방법1"); //key를 set에 담아서 iterator로 가져옴.
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println("key" + ":" + key + ", value: " + map.get(key));
//		for(Entry<String,Integer> ent : map) {
//			System.out.println();
		}
	}
}
