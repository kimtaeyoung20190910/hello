package com.yedam.generic;

public class Pair<K, V> {

	private K kev;
	private V value;
	public Pair(K kev, V value) {
		super();
		this.kev = kev;
		this.value = value;
	}
	public K getKev() {
		return kev;
	}
	public void setKev(K kev) {
		this.kev = kev;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
