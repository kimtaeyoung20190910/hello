package com.yedam.edception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
	String data1 = null;
	String data2 = null;
	try {
		data1 = args[0];
		data2 = args[1];
		System.out.println("data1" + data1);
		System.out.println("data2" + data2);
	}catch(Exception e) {
		System.out.println("실행매개변수의 값이 부족해");
		System.out.println("매개변수 2개가 필요해유");
	} finally {
		System.out.println("다시 실행하세오");
	}
	 System.out.println("--프로그램 종료--");
	
	try {
	int val1 = Integer.parseInt(data1);
	int val2 = Integer.parseInt(data2);
	System.out.println("sum : " + (val1 + val2));
	}catch (Exception e) {
		System.out.println("변환불가");
		System.out.println("다시 실행");
	}
	System.out.println("종료");

}}
