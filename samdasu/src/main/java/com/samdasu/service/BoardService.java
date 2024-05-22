package com.samdasu.service;

import java.util.List;

import com.samdasu.dto.Board;

public interface BoardService {
	public int getTotalBoardCount();
	public List<Board> getBoards();
	public Board getBoard(int num);
	public void insBoard(Board board);
	public void upBoard(Board board);
	public void upBoardVcnt(int num);
	public void delBoard(int num);
}
