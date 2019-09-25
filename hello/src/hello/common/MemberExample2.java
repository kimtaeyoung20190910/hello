package hello.common;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] memberArray = new Member[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.생성 2.전체리스트 3.id조회 4.종료");
			System.out.println("--------------------------");
			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getList();
			} else if (menu == 3) {
				getMemberlist();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of main

	// 계좌인스턴스 만드는 메소드
	public static void createMember() {
		System.out.println("이름 입력:");
		String Name = sc.nextLine();
		System.out.println("ID 입력:");
		String Id = sc.nextLine();
		System.out.println("Password 입력:");
		String Passward = sc.nextLine();
		System.out.println("나이 입력:");
		int Age = sc.nextInt();
		Member mem = new Member(Name, Id, Passward, Age);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = mem;
				break;
			}
		}
	}

	// 전체리스트
	public static void getList() {
		for (Member m : memberArray) {
			if (m != null)
				System.out.println("이름: " + m.getName() + ",Age:" + m.getAge());
		}
	}

	// id조회 //(id,비번 같으면 이름,나이 출력.)
			 // (id가 맞고 비번 틀리면 비밀번호가 잘못됐습니다.)
			 // (id-x, 비번x이면 존재하지 않는 아이디입니다.)
	public static void getMemberlist() {
		System.out.println("id 입력:");
		String Id = sc.nextLine();
		System.out.println("비밀번호 입력:");
		String Passward = sc.nextLine();
		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;
		for (Member m : memberArray) {
			if (m != null && m.getId().equals(Id)) {
				if (m.getPassword().equals(Passward)) {
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
			} else {
				isId = true;
				isPw = false;break;
				}
//			}else {
//				isId = false;
//				isPw = false;
//				}	
//		}
//	
		if(isId && isPw)
			System.out.println("이름은:" + name + ", 나이는" + age);
		else if(isId && !isPw)
			System.out.println("비밀번호가 잘못됐습니다.");
		else if(!isId && !isPw)
			System.out.println("존재하지 않는 아이디입니다.");
}
}