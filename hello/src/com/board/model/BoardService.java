package com.board.model;

public interface BoardService {
	public void writeBoard(Board board);
	public Board getBoard(int board);
	public Board[] getBoardList();
}
