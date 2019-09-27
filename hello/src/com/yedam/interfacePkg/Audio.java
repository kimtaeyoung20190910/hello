package com.yedam.interfacePkg;

public class Audio implements RemoteControl {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("============");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
	}
	
	@Override
	public void turnOn() {
		System.out.println("audio을 켭니다.");
	}	
	@Override
	public void turnOff() {
		System.out.println("audio을 끕니다.");
	}	
	@Override
	public void setVolume(int volume) {
	}


}
