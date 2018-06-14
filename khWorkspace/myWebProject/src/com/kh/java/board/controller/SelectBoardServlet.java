package com.kh.java.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.java.board.model.service.BoardService;
import com.kh.java.board.model.vo.BoardVo;

/**
 * Servlet implementation class SelectBoardServlet
 */
@WebServlet("/selectBoard.do")
public class SelectBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectBoardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		BoardVo board = new BoardService().selectBoard(boardNo);
		
		String url = "";
		
		if(null != board) {
			url = "views/board/boardDetail.jsp";
			request.setAttribute("board", board);
			
		}else {
			url = "views/common/errorPage.jsp";
			request.setAttribute("msg", "게시글 상세 조회에 실패하였습니다.");
		}
		
		
		RequestDispatcher view = request.getRequestDispatcher(url);
		view.forward(request, response);
		
	}

}