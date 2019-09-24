package hello.common;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		
	Member m1 = new Member();
	m1.setName("kimty");
	m1.setId("kty");
	m1.setPassword("kty123");
	m1.setAge(24);
	
	Member m2 = new Member("관리자", "admin");
	m2.setPassword("admin123");
	m2.setAge(0);
	
	Member m3 = new Member("사용자", "user1", "user123", 10);
	Member[] m = {m1,m2,m3};
	Scanner sc = new Scanner(System.in);
	System.out.println("조회할 id 입력");
	String id = sc.nextLine();
	for(int i=0; i<m.length; i++) {
	if(m[i].getName().equals(name)) {
		System.out.println(m[i].getName()+""+m[i].getId());

	}
	}
	}
}

