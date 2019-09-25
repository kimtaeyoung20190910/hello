package com.yedam;

public class CellPhone { //부모 클래스
	String model;//필드
	String color;
	
	
	public CellPhone() {
		super();
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color; //생성자	
	}
	
	
	void powerOn() { //메소드
		System.out.println("전원 켭니다.");
	}	
	void powerOff() {
		System.out.println("전원 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
