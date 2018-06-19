package com.kh.java.info.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/info.do")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public InfoServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("프로토콜 : " + request.getProtocol());
		System.out.println("서버 명 : " + request.getServerName());
		System.out.println("웹 루트 경로 : " + request.getContextPath());
		System.out.println("현재 경로 : " + request.getRequestURI());
		System.out.println("요청자 IP 정보 : " + request.getRemoteAddr());
		
		Enumeration<String > headers = request.getHeaderNames();
		String headerName = "";
		
		while(headers.hasMoreElements()){
			headerName = headers.nextElement();
			System.out.println(headerName + " : " 
								+ request.getHeader(headerName));
		}
		
		HttpSession session = request.getSession();
		System.out.println("발급된 세션 아이디 : " + session.getId());
		System.out.println("세션이 최근 접속 한 시간 : " + 
										session.getLastAccessedTime());
		
		//접속 했던 사람들에 대한 기록
		//application 영역에 데이터를 저장
		ServletContext application = getServletContext();
		Set<String> userList = (Set<String>)application.getAttribute("userList");
		
		if(userList == null){
			userList = new HashSet<String>();
		}
		userList.add(request.getRemoteAddr());
		application.setAttribute("userList", userList);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>test</title></head>");
		out.println("<body>");
		out.println("<ol>");
		for(String userIp : userList){
			out.println("<li>"+userIp+"</li>");
		}
		out.println("</ol>");
		out.println("</body>");
		out.println("</html>");
	}
}