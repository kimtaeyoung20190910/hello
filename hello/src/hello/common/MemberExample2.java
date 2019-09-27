package hello.common;

import java.util.Scanner;

public class MemberExample2 {
	static Member[] memAry = new Member[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while (run) {
			System.out.println("1.생성 2.리스트 3.조회(id) 4.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMemberList();
			} else if (menu == 3) {
				getMember();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public static void createMember() {
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("아이디입력:");
		String id = sc.nextLine();
		System.out.println("비번입력:");
		String pwd = sc.nextLine();
		System.out.println("나이입력:");
		int age = sc.nextInt();
		Member member = new Member(name, id, pwd, age);
		for (int i = 0; i < memAry.length; i++) {
			if (memAry[i] == null) {
				memAry[i] = member;
				break;
			}
		}
	}

	public static void getMemberList() {
		for (Member m : memAry) {
			if (m != null) {
				System.out.println(m.getName() + "," + m.getId());
			}
		}
	}

	public static void getMember() {
		System.out.println("조회할 번호입력:");
		String id = sc.nextLine();
		System.out.println("비번 입력:");
		String passwd = sc.nextLine();
		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;
		// id, passwd 같으면 이름, 나이를 출력.
		// id 맞고 passwd 가 다르면 비밀번호가 잘못됐습니다.
		// id(x), passwd(x) => 존재하지 않는 아이디입니다.
		for (Member m : memAry) {
			if (m != null && m.getId().equals(id)) {
				if (m.getPassword().equals(passwd)) {// id(o),passwd(o)
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
				} else { // id(o),passwd(x)
					isId = true;
					isPw = false;
					break;
				}
			}
		}
		if (isId && isPw)
			System.out.println("이름은: " + name + ", 나이는 " + age);
		else if (isId && !isPw)
			System.out.println("비번이 틀립니다.");
		else if (!isId && !isPw) {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
}