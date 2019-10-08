package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardService;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴 선택하세요.");
			System.out.println("1.작성2.단건조회3.전체조회4.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴선택을 해주세요.");
				System.out.println("1.작성2.단건조회3.전체조회4.종료");
				sc.nextLine();
			}
			if (menu == 1) {
				writeBoard();
			}
			if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		Board board = new Board(boardNo, "", content, "");
	}

	public void writeBoard() {
		System.out.println("직원등록.");
		System.out.println("직원번호입력.");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("이메일 입력하세요.");
		String email = sc.nextLine();
		System.out.println("입사일 입력하세요.");
		String hireDate = sc.nextLine();
		System.out.println("급여 입력하세요.");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("jobid 입력하세요.");
		String jobId = sc.nextLine();
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate);
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

//		Board board = new Board(boardNo, title, contents, writer);
//		BoardService servcie = new BoardServiceImpl();
//		for (int i=0; i<boardAry.length; i++) {
//			if(boardAry[i] == null) {
//				boardAry[i] == board;
//				break;
//			}
//
//		}
	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호 입력.");
		int empNo = sc.nextInt();
		Employee emp = service.getEmployee(empNo);
		System.out.println(emp);
//		BoardService service = new BoardServiceImpl();
//		Board board = service.getBoard(boardNo, boardAry);
//		for(int i=0; i<boardAry.length; i++) {
//			if(boardAry!=null && boardAry[i].getBoardNo() == boardNo ) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체직원조회.");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
//		for (int i=0; i<boardAry.length; i++) {
//			if(boardAry[i] == null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
//	}
	}

	public void deleteBoard() {
		System.out.println("삭제할 번호:");
		System.out.println("조회할 번호 입력.");
		int empNo = sc.nextInt();
		service.deleteEmployee(empNo);
		System.out.println("번호" + empNo);
	}
}
