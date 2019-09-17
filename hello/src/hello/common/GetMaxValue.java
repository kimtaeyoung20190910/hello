package hello.common;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] aAry = new int[5]; //배열 선언 (정수 5개)
		for (int i = 0; i < aAry.length; i++) { 
		System.out.println("정수값을 입력:");
		aAry[i] = sc.nextInt();
		}
	int MaxValue = 0;
	for(int i = 0; i < aAry.length; i++) {
		MaxValue = (MaxValue > aAry[i] ? MaxValue : aAry[i]);
	}
	System.out.println("제일 큰 값은: " + MaxValue);
	
	}
}
	