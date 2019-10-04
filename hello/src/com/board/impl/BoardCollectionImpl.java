package com.board.impl;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
			}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for(Board brd: boards) {
			if (brd.getBoardNo()==boardNo) {
				boardTemp = brd;
		}
		return boardTemp;
	}
	}
	
	@Override
	public Board getBoardList(List<Board> boards) {
		List<Board> list = new Arraylist<>();
		for(Board brd: boards) {
			list.add(brd);
		}
		return List;
		}
	
	@Override
	public void deleteBoard(int boardNo, List<Board> boards) {
		boards.remove(boardNo);
			}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for(Board brd : boards) {
			if(brd.getBoardNo() == board.getBoardNo())
				brd.setTitle(board.getTitle());
				brd.setContents(board.getContents());
				brd.setWriter(board.getWriter());
		
			}
		}
	}
}
