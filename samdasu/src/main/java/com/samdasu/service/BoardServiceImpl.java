package com.samdasu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samdasu.dao.BoardDAO;
import com.samdasu.dto.Board;

@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public int getTotalBoardCount() {
		return boardDAO.getTotalBoardCount();
	}

	@Override
	public List<Board> getBoards() {
		return boardDAO.getBoards();
	}

	@Transactional
	@Override
	public Board getBoard(int num) {
		return boardDAO.getBoard(num);
	}

	@Override
	public void insBoard(Board board) {
		boardDAO.insBoard(board);
	}

	@Override
	public void upBoard(Board board) {
		boardDAO.upBoard(board);
	}

	@Override
	public void upBoardVcnt(int num) {
		boardDAO.upBoardVcnt(num);
	}

	@Override
	public void delBoard(int num) {
		boardDAO.delBoard(num);
	}
	
}
