package com.yedam;

import java.util.Scanner;

public class MemberExample {

	static Member[] memAry = new Member[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while (run) {
			System.out.println("1.회원등록 2.회원번호조회 3.등록그룹별 리스트");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMember();
			} else if (menu == 3) {
				getMemberList();
				run = false;
			}
		}
	}

	public static void createMember() {
		System.out.println("회원번호 입력:");
		int id = sc.nextInt();
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		System.out.println("등록과정 입력:");
		String subject = sc.nextLine();
		Member member = new Member(id, name, subject);
		for (int i = 0; i < memAry.length; i++) {
			if (memAry[i] == null) {
				memAry[i] = member;
				break;
			}
		}
	}

	public static void getMember() {
		System.out.println("조회할 번호입력:");
		int id = sc.nextInt();
		sc.nextLine();
		Member m = new Member(id);
		if(m ! == null) {
		System.out.println(m.getName() + "," + m.getSubject());
		}
	}

	public static void getMemberList() {
		for (Member m : memAry) {
			if (m != null) {
				System.out.println(m.getName() + "," + m.getId());
			}
		}
	}
}
