package com.yedam.collection.set;

public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.name.equals(this.name) && mem.age == this.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.name.hashCode() + age;
	}

}
