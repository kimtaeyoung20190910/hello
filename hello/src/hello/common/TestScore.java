package hello.common;

import java.util.Scanner;

public class TestScore {
	static Test[] testAry = new Test[10];
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
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
			} else if (menu == 5) {
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
		System.out.println("전체조회");
		for (Test t : testAry) {
			if (t != null) {
				System.out.println("번호:" + t.getStudentNo() + "," + "이름:" + t.getName() + "," + "국어점수:" + t.getGrade1()
						+ "," + "영어점수:" + t.getGrade2() + "," + "수학점수" + t.getGrade3());
			}
		}
	}

	public static void getNumList() {
		System.out.println("조회할 학번입력:");
		int studentNo = sc.nextInt();
		double total = 0, avg = 0;
		for (Test t : testAry) {
			if (t != null) {
				if (t != null && t.getStudentNo()==(studentNo)) {
					total = t.getGrade1() + t.getGrade2() + t.getGrade3();
					avg = total / 3;
					System.out.println(t.getStudentNo() + "," + t.getName() + "," + t.getGrade1() + "," + t.getGrade2()
							+ "," + t.getGrade3() + "," + total + "," + avg);
				}
			}
		}
	}

	static void getSet() {
		double total1 = 0, total2 = 0, total3 = 0;
		int count = 0;
		for (Test t : testAry) {
			if (t != null) {
				total1 += t.getGrade1();
				total2 += t.getGrade2();
				total3 += t.getGrade3();
				count++;
			}
			System.out.println("통계");
			System.out.println("국어 합계:" + total1 + ", 영어 합계:" + total2 + ", 수학 합계:" + total3 + ", 총 합계:"
					+ (total1 + total2 + total3) + ", 평균:" + (total1 + total2 + total3) / (count * 3));
		}
	}

	public static void getArray() {
		System.out.println();

	}
}
