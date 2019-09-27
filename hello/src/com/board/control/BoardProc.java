package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
	Board[] boardAry = new Board[10];
	
	public void execute() {
		while (true) {
			System.out.println("메뉴 선택하세요.");
			System.out.println("1.작성2.단건조회3.전체조회4.종료");
			int menu = sc.nextInt();sc.nextLine();
			if(menu==1) {
				writeBoard();
			}if(menu==2) {
				getBoard();
			}else if(menu==3) {
				getBoardList();
			}else if(menu==4) {
				updateBoard(); 
			}else if (menu==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
				}
			}
			System.out.println("프로그램 종료.");
	}
	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		Board board = new Board(boardNo, "", content, "");
	}
	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글번호입력.");
		int boardNo = sc.nextInt();
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		BoardService servcie = new BoardServiceImpl();
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
		int boardNo = sc.nextInt();
		BoardService service = new BoardServiceImpl();
		Board board = service.getBoard(boardNo, boardAry);
//		for(int i=0; i<boardAry.length; i++) {
//			if(boardAry!=null && boardAry[i].getBoardNo() == boardNo ) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		Board[] resultAry = service.getBoardList(boardAry);
		for(Board brd : resultAry) {
			System.out.println(brd);
		}
//		for (int i=0; i<boardAry.length; i++) {
//			if(boardAry[i] == null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
//	}
	}
		public void deleteBoard() {
			System.out.println("삭제할 게시글 번호:");
		}
}
