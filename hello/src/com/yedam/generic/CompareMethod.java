package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result = Util.compare(p1, p2);
		if(result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
		
		
		
	//	("user1","orange");
	//	("user1","orange");
		Pair<String, String> p3 = new Pair<>("user1","orange");
		Pair<String, String> p4 = new Pair<>("user1","orange");
		result = Util.compare(p3, p4);
		if(result)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음.");
	
	
	// Util.compareValue();
//	Pair("orange", 10);
//	Pair("apple", 10);
//	
//	Pair("orange", "good");
//	Pair("apple", "good");
		
		Integer intV1 = Util.compare(10, 20);
		System.out.println(intV1);
		
	}
	
}
