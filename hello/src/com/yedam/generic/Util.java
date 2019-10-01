package com.yedam.generic;

public class Util {
	public static <K> Box<K> boxing(K t) {
		Box<K> box = new Box<K>();
		box.setObj(t);
		return box;

	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKev().equals(p2.getKev());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}

	public static<T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);

	}
}
