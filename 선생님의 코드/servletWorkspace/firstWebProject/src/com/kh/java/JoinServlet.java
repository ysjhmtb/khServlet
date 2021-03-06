package com.kh.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/join.do")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//전달 된 값을 변수에 저장
		String userId = request.getParameter("userid");
		String password = request.getParameter("userpwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel1 = request.getParameter("tel1");
		String tel2 = request.getParameter("tel2");
		String tel3 = request.getParameter("tel3");
		String phone = tel1 + "-" + tel2 + "-" + tel3;
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] hobbys = request.getParameterValues("hobby");
		String hobbyStr = "";
		for(String hobby : hobbys){
			hobbyStr += hobby + " ";
		}
		
		//화면 출력
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>회원 가입 완료</title></head>");
		out.println("<body>");
		out.println("<h1>회원 가입이 완료되었습니다.</h1>");
		out.println("<h3>입력 하신 회원 정보는 아래와 같습니다.</h3>");
		out.println("<p>아이디 : " + userId + "</p>");
		out.println("<p>비밀번호 : " + password + "</p>");
		out.println("<p>이름 : " + name + "</p>");
		out.println("<p>이메일 : " + email + "</p>");
		out.println("<p>전화번호 : " + phone + "</p>");
		out.println("<p>성별 : " + ("m".equals(gender) ? "남자" : "여자") + "</p>");
		out.println("<p>직업 : " + job + "</p>");
		out.println("<p>취미 : " + hobbyStr + "</p>");
		out.println("<hr>");
		out.println("<a href='/firstWebProject/index.html'>첫 페이지로 이동</a>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}






