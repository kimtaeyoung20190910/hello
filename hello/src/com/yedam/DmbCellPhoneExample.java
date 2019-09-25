package com.yedam;

public class DmbCellPhoneExample { //자식 클래스 사용
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("S10", "white",10);
		System.out.println("model: " + dmbCell.model); //부모 필드
		System.out.println("color: " + dmbCell.color); //부모 필드
		System.out.println("channel: "+ dmbCell.channel); //자신 필드
		
		dmbCell.powerOn(); //부모 메소드
		dmbCell.turnOnDmb();//자신 메소드
		dmbCell.turnOffDmb(); //자신 메소드
		dmbCell.powerOff(); ///부모 메소드
	}
}
