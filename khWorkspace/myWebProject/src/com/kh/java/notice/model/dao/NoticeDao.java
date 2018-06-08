package com.kh.java.notice.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import com.kh.java.common.JDBCTemplate;
import com.kh.java.notice.model.vo.NoticeVo;

public class NoticeDao {

	public ArrayList<NoticeVo> selectNoticeList(Connection con) {
		//커넥션을 맺는다
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<NoticeVo> result = new ArrayList<>();
		//쿼리 객체 생성
		try {
			stmt = con.createStatement();
			String query = "SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME " 
						+"FROM NOTICE "
						+"JOIN MEMBER ON (NWRITER = USERID)";
			rs = stmt.executeQuery(query);
			
			//결과 처리(resultset)
			NoticeVo temp = null;
			while(rs.next()){
				int no = rs.getInt("nno");
				String title = rs.getString("ntitle");
				String content = rs.getString("ncontent");
				String writer = rs.getString("nwriter");
				int count = rs.getInt("ncount");
				Date date = rs.getDate("ndate");
				String name = rs.getString("username");
				
				temp = new NoticeVo(no, title, content, writer, count, date);
				temp.setName(name);
				result.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//close
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}
		return result;
	}
	
	public NoticeVo selectNotice(Connection con, int noticeNo){
		Statement stmt = null;
		ResultSet rs = null;
		String query = "";
		NoticeVo result = null;
		try {
			//쿼리 전송 객체 생성
			stmt = con.createStatement();
			//쿼리 작성
			query = "SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME " + 
						"FROM NOTICE " + 
						"JOIN MEMBER ON (NWRITER = USERID) " + 
						"WHERE NNO = " + noticeNo;
			//쿼리 실행 후 결과 처리
			rs = stmt.executeQuery(query);
			
			while(rs.next()){
				int no = rs.getInt("nno");
				String title = rs.getString("ntitle");
				String content = rs.getString("ncontent");
				String writer = rs.getString("nwriter");
				int count = rs.getInt("ncount");
				Date date = rs.getDate("ndate");
				String name = rs.getString("username");
				
				result = new NoticeVo(no, title, content, writer, count, date, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//close
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}
		return result;
	}

	public ArrayList<NoticeVo> selectNoticeKeyword(Connection con, int condition, String keyword) {
		ArrayList<NoticeVo> list = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME " 
							+ "FROM NOTICE "
							+ "JOIN MEMBER ON (NWRITER = USERID) ";
		try {
			
			/*

			 0 : 전체

			 SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME

			 FROM NOTICE

			 JOIN MEMBER ON (NWRITER = USERID)

			 WHERE (NTITLE LIKE '%점검%' 

			 		OR NCONTENT LIKE '%검색어%' 

			 		OR USERNAME LIKE '%검색어%');

			 

			 

			 1 : 제목

			 

			 SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME

			 FROM NOTICE

			 JOIN MEMBER ON (NWRITER = USERID)

			 WHERE NTITLE LIKE '%점검%';

			 

			 

			 2 : 내용

			 

			 SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME

			 FROM NOTICE

			 JOIN MEMBER ON (NWRITER = USERID)

			 WHERE NCONTENT LIKE '%검색어%';

			 

			 

			 3 : 작성자(이름)

			 

			 SELECT NNO, NTITLE, NCONTENT, NWRITER, NCOUNT, NDATE, USERNAME

			 FROM NOTICE

			 JOIN MEMBER ON (NWRITER = USERID)

			 WHERE USERNAME LIKE '%검색어%';

			 

			 */

			//1. 쿼리 전송 객체 생성
			stmt = con.createStatement();
			//2. 쿼리 작성
			switch(condition){
			case 1 :
				//제목
				query += "WHERE NTITLE LIKE '%" + keyword + "%' ";
				break;
			case 2:
				//내용
				query += "WHERE NCONTENT LIKE '%" + keyword + "%' ";
				break;
			case 3:
				//작성자
				query += "WHERE USERNAME LIKE '%" + keyword + "%' ";
				break;
			case 0:
				query += "WHERE (USERNAME LIKE '%" + keyword + "%' ";
				query += " OR NCONTENT LIKE '%" + keyword + "%' ";
				query += " OR NTITLE LIKE '%" + keyword + "%') ";
				break;
			}
			System.out.println("실행 된 쿼리 : " + query);
			
			//3. 결과 처리
			rs = stmt.executeQuery(query);
			list = new ArrayList<NoticeVo>();
			NoticeVo temp = null;
			
			while(rs.next()){
				int no = rs.getInt("nno");
				String title = rs.getString("ntitle");
				String content = rs.getString("ncontent");
				String writer = rs.getString("nwriter");
				int count = rs.getInt("ncount");
				Date date = rs.getDate("ndate");
				String name = rs.getString("username");
				
				temp = new NoticeVo(no, title, content, writer, count, date, name);
				list.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//4. 자원 반납(resultset, statement)
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}
		return list;
	}

	public int insertNotice(Connection con, NoticeVo notice) {
		int result = 0;
		Statement stmt = null;
		String query = "";
		
		try {
			
			
			//1.쿼리 실행 객체 생성.
			stmt = con.createStatement();
			
			//2.쿼리 작성.
			/*
			 INSERT INTO NOTICE 
			 VALUES (SEQ_NNO.NEXTVAL, '제목', '내용', 'admin', 0, sysdate);
			 
			 
			 */
			query = "INSERT INTO NOTICE " 
					+ "VALUES (SEQ_NNO.NEXTVAL, '" + notice.getTitle() +"', '"
					+ notice.getContent() + "', '"
					+ notice.getWriter() + "', 0, sysdate)";
			System.out.println("공지 사항 작성 쿼리 : " + query);
			
			
			//3.쿼리 실행.
			result = stmt.executeUpdate(query);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//4.자원 반납.
			JDBCTemplate.close(stmt);
		}
		
		
		return result;
	}

	public int updateNoticeCount(Connection con, int noticeNo) {
		int result = 0;
		Statement stmt = null;
		String query = "";
		
		
		try {
			//1.쿼리 전송 객체 생성.
			stmt = con.createStatement();
			//2.쿼리 작성.
			/*
			 UPDATE NOTICE 
			 SET NCOUNT = NCOUNT + 1
			 WHERE NNO = 24;
			 */
			
			query = "UPDATE NOTICE "
					+ "SET NCOUNT = NCOUNT + 1 "
					+ "WHERE NNO = " + noticeNo;
			
			//3.쿼리 실행.
			result = stmt.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4.자원 반납.
			JDBCTemplate.close(stmt);
		}
		
		//5.결과 반환.
		return result;
	}
}





























