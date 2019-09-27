package hello.common;

import java.util.Scanner;

public class TestScore {
	static Test[] testAry = new Test[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		int sum,avg;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.등록 | 2.전체리스트| 3.번호조회 |4.통계 |5.정렬 |6.종료");
			System.out.println("--------------------------------------------------");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createGrade();
			} else if (menu == 2) {
				getList();
			} else if (menu == 3) {
				getNumList();
			} else if (menu == 4) {
				getSet();
			}else if (menu == 5) {
				getArray();
			} else if (menu == 6) {
				run = false;

		}
		System.out.println("프로그램 종료.");
	 }
	}
	public static void createGrade() {
		System.out.println("학번입력:");
		int studentNo = sc.nextInt();
		System.out.println("이름입력:");
		String Name = sc.nextLine();
		System.out.println("국어점수:");
		int grade1 = sc.nextInt();
		System.out.println("영어점수:");
		int grade2 = sc.nextInt();
		System.out.println("수학점수:");
		int grade3 = sc.nextInt();
		Test test = new Test(studentNo, Name, grade1, grade2, grade3);
		for (int i = 0; i < testAry.length; i++) {
			if (testAry[i] == null) {
				testAry[i] = test;
				break;
			}
		}
	}
	
	public static void getList() {
		
		
		for (Test t : testAry) {
			if (t != null) {		
				System.out.println("번호:"+t.getStudentNo()+","+"이름:"+t.getName()+","+
						"국어점수:"+t.getGrade1()+","+"영어점수:"
						+t.getGrade2()+","+"수학점수"+t.getGrade3());
			}
		}
	}

	public static void getNumList() {
		System.out.println("조회할 id입력:");
		int studentNo = sc.nextInt();

		for (Test t : testAry) {
			if (t != null) {
			System.out.println("번호:"+t.getStudentNo()+","+"이름:"+t.getName()+","+
					"국어점수:"+t.getGrade1()+","+"영어점수:"
					+t.getGrade2()+","+"수학점수"+t.getGrade3()
					+"총점:"+);
		}
			int sum = 0;
			double avg = 0.0;
			System.out.println("총점:" + sum);
			System.out.println("평균:" + avg);

			}		
		}
	}}
	
	

	
		
		
		
		