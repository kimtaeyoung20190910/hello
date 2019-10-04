package com.board.model;

public interface BoardCollection {
		public void writeBoard(Board board, List<Board> boards); //글작성
		
		public Board getBoard(int boardNo, List<Board> boards); //한건조회
		
		public Board[] getBoardList(List<Board> boards);//전체리스트
		
		public void updateBoard(Board board, List<Board> boards);//변경
		
		public void deleteBoard(int boardNo, List<Board> boards);//삭제
	}

