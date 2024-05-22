package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samdasu.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardService boardService;
	
	@Override
	public int getTotalBoardCount() {
		return boardService.getTotalBoardCount();
	}

	@Override
	public List<Board> getBoards() {
		return boardService.getBoards();
	}

	@Override
	public Board getBoard(int num) {
		return boardService.getBoard(num);
	}

	@Override
	public void insBoard(Board board) {
		boardService.insBoard(board);
	}

	@Override
	public void upBoard(Board board) {
		boardService.upBoard(board);
	}

	@Override
	public void upBoardVcnt(int num) {
		boardService.upBoardVcnt(num);
	}

	@Override
	public void delBoard(int num) {
		boardService.delBoard(num);
	}
	
}
