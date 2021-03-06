package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/login.do")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전송 값에 한글이 있을 경우 인코딩 처리
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html; charset=UTF-8");
				
				//전송 된 값 변수에 저장
				String id = request.getParameter("id");
				String password = request.getParameter("pwd");
				
				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + password);
		
				PrintWriter out = response.getWriter();
				out.println("<html>");
				out.println("<head>");
				out.println("<title>결과 출력</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h3>아이디 : "+id+"</h3>");
				out.println("<h3>비밀번호 : "+password+"</h3>");
				out.println("</body>");
				out.println("</html>");
				out.flush();
				out.close();
				
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
