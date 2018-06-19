package com.kh.java.scope.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/scope.do")
public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ScopeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 처리 필터 적용 됨
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		//page - response
		int sum = num1 + num2; 
		//request
		request.setAttribute("requestSum", sum);
		//session
		//기존에 생성 된 세션이 없다면 새로 만들어라,
		//기존에 생성 된 세션이 있다면 생성되 있던 세션을 반환해라
		HttpSession session = request.getSession();
		session.setAttribute("sessionSum", sum);
		//application - context
		ServletContext application = getServletContext();
		application.setAttribute("applicationSum", sum);
		
		RequestDispatcher rd = request.getRequestDispatcher("scopeAck.do");
		rd.forward(request, response);
	}
}











