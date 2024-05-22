package com.samdasu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samdasu.dto.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int getTotalBoardCount() {
		return sqlSession.selectOne("board.getTotalBoardCount");
	}

	@Override
	public List<Board> getBoards() {
		return sqlSession.selectList("board.getBoards");
	}

	@Override
	public Board getBoard(int num) {
		return sqlSession.selectOne("board.getBoard" , num);
	}

	@Override
	public void insBoard(Board board) {
		sqlSession.insert("board.insBoard", board );
	}

	@Override
	public void upBoard(Board board) {
		sqlSession.update("board.upBoard", board);
	}

	@Override
	public void upBoardVcnt(int num) {
		sqlSession.update("board.upBoardVcnt" , num);
	}

	@Override
	public void delBoard(int num) {
		sqlSession.delete("board.delBoard" , num);
	}
	
	
	
}
