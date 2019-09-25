package com.yedam;

public class DmbCellPhone extends CellPhone { //자식클래스
	int channel; //필드

	public DmbCellPhone(int channel) {
		super(); //CellPhone
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
		// TODO Auto-generated constructor stub
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
	
}
