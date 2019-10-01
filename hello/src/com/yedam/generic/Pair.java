package com.yedam.generic;

public class Pair<K, V> {
	private K kev;
	private V value;
	
	public Pair(K kev, V value) {
		this.kev = kev;
		this.value = value;
	}
	public K getKev() {
		return kev;
	}

	public V getValue() {
		return value;
	}

}
