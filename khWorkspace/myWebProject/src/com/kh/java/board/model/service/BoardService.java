package com.kh.java.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.java.board.model.dao.BoardDao;
import com.kh.java.board.model.vo.BoardVo;
import com.kh.java.common.JDBCTemplate;

public class BoardService {
	public ArrayList<BoardVo> selectBoardList(){
		//1. 커넥션 연결
		Connection con = JDBCTemplate.getConnection();
		
		//2. dao 메소드 호출
		ArrayList<BoardVo> list = new BoardDao().selectBoardList(con);
		
		//3. 자원 반납
		JDBCTemplate.close(con);
		
		return list;
	}
	
	
	
}
