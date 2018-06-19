/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-06-19 10:56:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.java.common.PageInfo;
import com.kh.java.board.model.vo.BoardVo;
import java.util.ArrayList;
import com.kh.java.member.model.vo.MemberVo;

public final class boardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/header.jsp", Long.valueOf(1529402465000L));
    _jspx_dependants.put("/views/board/../common/footer.jsp", Long.valueOf(1527851360000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.java.common.PageInfo");
    _jspx_imports_classes.add("com.kh.java.member.model.vo.MemberVo");
    _jspx_imports_classes.add("com.kh.java.board.model.vo.BoardVo");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	ArrayList<BoardVo> list = (ArrayList<BoardVo>)request.getAttribute("list");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	int listCount = pi.getTotalCount();
	int currentPage = pi.getCurrentPage();
	int maxPage = pi.getMaxPage();
	int startPage = pi.getStartPage();
	int endPage = pi.getEndPage();

      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>게시판 목록</title>\n");
      out.write("<style>\n");
      out.write(".outer{\n");
      out.write("\twidth:800px;\n");
      out.write("\theight:570px;\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("\tborder:1px solid white;\n");
      out.write("}\n");
      out.write(".tableArea{\n");
      out.write("\twidth:800px;\n");
      out.write("\theight:300px;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("}\n");
      out.write("table td{\n");
      out.write("\ttext-align:center;\n");
      out.write("}\n");
      out.write(".searchArea{\n");
      out.write("\twidth:650px;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("\tfunction writeBoard(){\n");
      out.write("\t\tlocation.href=\"views/board/boardForm.jsp\";\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");

	MemberVo member = (MemberVo)session.getAttribute("user");

      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/mwp/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"//developers.kakao.com/sdk/js/kakao.min.js\"></script>\n");
      out.write("<script\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("  integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<style>\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground:url(\"/mwp/images/background.jpg\") no-repeat;\n");
      out.write("\t\tbackground-size:cover;\n");
      out.write("\t}\n");
      out.write("\t.wrap{\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t}\n");
      out.write("\t.menu{\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t\tvertical-align:middle;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tdisplay:table-cell;\n");
      out.write("\t}\n");
      out.write("\t.nav{\n");
      out.write("\t\twidth:600px;\n");
      out.write("\t\tmargin-left:auto;\n");
      out.write("\t\tmargin-right:auto;\n");
      out.write("\t}\n");
      out.write("\t.menu:hover{\n");
      out.write("\t\tbackground:lightgray;\n");
      out.write("\t\tcolor:orangered;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.loginArea > #loginForm, .userInfo{\n");
      out.write("\t\tfloat:right;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#memberLoginBtn, #memberJoinBtn, #memberInfoBtn, #memberLogoutBtn{\n");
      out.write("\t\tdisplay:inline-block;\n");
      out.write("\t\tvertical-align:middle;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:30px;\n");
      out.write("\t\tborder-radius:5px;\n");
      out.write("\t\tbackground:orangered;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.tile{\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:150px;\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\tdisplay:inline-block;\n");
      out.write("\t}\n");
      out.write("\t.first-line{\n");
      out.write("\t\tmargin-top:10%;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.tile-menu:hover{\n");
      out.write("\t\tbackground:skyblue;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t}\n");
      out.write("\t.notile{\n");
      out.write("\t\tvisibility:hidden;\n");
      out.write("\t}\n");
      out.write("\t.tile1{\n");
      out.write("\t\tbackground:darkgray;\n");
      out.write("\t}\n");
      out.write("\t.footer{\n");
      out.write("\t\tposition:fixed;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tbottom:0;\n");
      out.write("\t\tbackground:brown;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("\tfunction login(){\n");
      out.write("\t\t$(\"#loginForm\").submit();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction logout(){\n");
      out.write("\t\tlocation.href = \"/mwp/logout.do\";\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction join(){\n");
      out.write("\t\tlocation.href = \"/mwp/views/member/memberJoin.jsp\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction mainPage(){\n");
      out.write("\t\t//request.getContextPath() - /mwp\n");
      out.write("\t\t//location.href = \"/mwp/index.jsp\";\n");
      out.write("\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction myInfo(){\n");
      out.write("// \t\tconsole.log(localStorage);\n");
      out.write("// \t\tlocalStorage.removeItem(\"kakao_2e2524e541bae9363d7d85d3d3fbde83\");\n");
      out.write("\t\tKakao.Auth.getStatus(function(status){\n");
      out.write("\t\t\tconsole.log(status.user.kaccount_email);\n");
      out.write("\t\t});\n");
      out.write("//\t\tlocation.href = \"../member/memberUpdate.jsp\";\n");
      out.write("\t\t//location.href = \"/mwp/views/member/memberUpdate.jsp\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction noticePage(){\n");
      out.write("\t\tlocation.href = \"/mwp/noticeList.do\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction boardPage(){\n");
      out.write("\t\t\n");
      out.write("\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/boardList.do\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction galleryPage(){\n");
      out.write("\t\tlocation.href = \"/mwp/galleryList.do\";\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t$(function(){\n");
      out.write("\t\tKakao.init('2176ef7240bdb4d15b1109660b0f4365');\n");
      out.write("\t    // 카카오 로그인 버튼을 생성합니다.\n");
      out.write("\t    Kakao.Auth.createLoginButton({\n");
      out.write("\t      container: '#kakao-login-btn',\n");
      out.write("\t      success: function(authObj) {\n");
      out.write("\t        alert(JSON.stringify(authObj));\n");
      out.write("\t      },\n");
      out.write("\t      fail: function(err) {\n");
      out.write("\t         alert(JSON.stringify(err));\n");
      out.write("\t      }\n");
      out.write("\t    });\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction kakao_logout(){\n");
      out.write("\t\tKakao.Auth.logout();\n");
      out.write("\t\t//페이지 이동\n");
      out.write("\t\t//다른 로직\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t$(function(){\n");
      out.write("\t\t\n");
      out.write("\t\t//enter key up method를 추천.\n");
      out.write("\t\t$(\"#pwdText\").change(function(){\n");
      out.write("\t\t\t$(\"#loginForm\").submit();\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1 align=\"center\">My Web Project</h1>\n");
      out.write("\t<div class=\"loginArea\">\n");
      out.write("\t");
if(member == null){ 
      out.write("\n");
      out.write("\t\t<form id=\"loginForm\" action=\"/mwp/login.do\" method=\"post\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>아이디 : </td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"userId\"/>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>비밀번호 : </td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"userPwd\" id=\"pwdText\"/>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t\t<div id=\"memberLoginBtn\" onclick=\"login();\">로그인</div>\n");
      out.write("\t\t\t\t\t\t<div id=\"memberJoinBtn\" onclick=\"join();\">회원가입</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t");
}else{
      out.write("\n");
      out.write("\t\t\t<div class=\"userInfo\">\n");
      out.write("\t\t\t\t<p>");
      out.print(member.getUserName());
      out.write("님 방문을 환영 합니다.</p>\n");
      out.write("\t\t\t\t<div id=\"memberInfoBtn\" onclick=\"myInfo();\">정보 수정</div>\n");
      out.write("\t\t\t\t<div id=\"memberLogoutBtn\" onclick=\"logout();\">로그 아웃</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<a id=\"kakao-login-btn\"></a>\n");
      out.write("<!-- \t<a href=\"http://developers.kakao.com/logout\">로그아웃</a> -->\n");
      out.write("\t<button onclick=\"kakao_logout();\">카카오 로그아웃</button>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<div class=\"wrap\">\n");
      out.write("\t\t<div class=\"nav\">\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"mainPage();\">HOME</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"noticePage();\">공지사항</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"boardPage();\">게시판</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"galleryPage()\">사진 게시판</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<div class=\"outer\">\n");
      out.write("\t<h1 align=\"center\">공지사항</h1>\n");
      out.write("\t<div class=\"tableArea\">\n");
      out.write("\t\t<table align=\"center\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th width=\"100\">글번호</th>\n");
      out.write("\t\t\t\t<th width=\"300\">글제목</th>\n");
      out.write("\t\t\t\t<th width=\"100\">작성자</th>\n");
      out.write("\t\t\t\t<th width=\"100\">조회수</th>\n");
      out.write("\t\t\t\t<th width=\"150\">작성일</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
if(list.size() == 0){ 
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan=\"5\">조회 된 게시글이 없습니다.</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t");
}else{ 
      out.write("\n");
      out.write("\t\t\t\t");
for(BoardVo n : list){ 
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(n.getNo());
      out.write("</td>\t\t\t\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t");
      out.print(n.getTitle());
      out.write("\n");
      out.write("<!-- \t\t\t\t\t\tif()// (O) 출력 -->\n");
      out.write("<!-- \t\t\t\t\t\telse // (X) 출력 -->\n");
      out.write("\t\t\t\t\t\t");
if(null != n.getAttachFile()){ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t(O)\n");
      out.write("\t\t\t\t\t\t");
}else{ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t(X)\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t\t\t</td>\t\t\t\n");
      out.write("\t\t\t\t\t<td>");
      out.print(n.getWriterName() );
      out.write("</td>\t\t\t\n");
      out.write("\t\t\t\t\t<td>");
      out.print(n.getCount());
      out.write("</td>\t\t\t\n");
      out.write("\t\t\t\t\t<td>");
      out.print(n.getWriteDate() );
      out.write("</td>\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 페이징 처리 부분     <<\t1 2 3 4 5 6 7 ... >>  -->\t\n");
      out.write("\t<div class=\"pageArea\" align=\"center\">\n");
      out.write("\t\t<button onclick=\"movePage(1);\"> << </button>\n");
      out.write("\t\t\n");
      out.write("\t\t");
for(int i = startPage ; i <= endPage ; i++){ 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t");
if(i == currentPage) {
      out.write("\n");
      out.write("\t\t\t\t<button onclick=\"movePage(");
      out.print(i);
      out.write(");\" disabled>");
      out.print(i );
      out.write("</button>\n");
      out.write("\t\t\t");
} else{
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<button onclick=\"movePage(");
      out.print(i);
      out.write(");\" >");
      out.print(i );
      out.write("</button>\n");
      out.write("\t\t\t");
} 
      out.write('\n');
      out.write('	');
      out.write('	');
} 
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<button onclick=\"movePage(");
      out.print(maxPage);
      out.write(");\"> >> </button>\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<div class=\"searchArea\" align=\"center\">\n");
      out.write("\t\t<select id=\"searchCondition\">\n");
      out.write("\t\t\t<option value=\"0\">전체</option>\n");
      out.write("\t\t\t<option value=\"1\">제목</option>\n");
      out.write("\t\t\t<option value=\"2\">내용</option>\n");
      out.write("\t\t\t<option value=\"3\">작성자</option>\n");
      out.write("\t\t</select>\t\t\n");
      out.write("\t\t<input type=\"text\" id=\"searchText\" placeholder=\"검색어 입력\"/>\n");
      out.write("\t\t<input type=\"button\" value=\"검색하기\" onclick=\"searchBoard();\"/>\n");
      out.write("\t\t");
if(null != member){
      out.write("\n");
      out.write("\t\t\t<input type=\"button\" value=\"작성하기\" onclick=\"writeBoard();\"/>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("\t$(\".tableArea td\").mouseenter(function(){\n");
      out.write("\t\t$(this).parent().css(\"background\",\"darkgray\");\n");
      out.write("\t\t$(this).parent().css(\"cursor\",\"pointer\");\n");
      out.write("\t}).mouseout(function(){\n");
      out.write("\t\t$(this).parent().css(\"background\",\"black\");\n");
      out.write("\t}).click(function(){\n");
      out.write("\t\t\n");
      out.write("\t\tvar boardNo = $(this).parent().children().eq(0).text();\n");
      out.write("\t\tlocation.href = \"/mwp/selectBoard.do?boardNo=\" + boardNo + \"&currentPage=\" + ");
      out.print(currentPage);
      out.write("; \t\t\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function movePage(pageNum){\n");
      out.write("\tlocation.href = \"/mwp/boardList.do?currentPage=\" + pageNum;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function searchBoard(){\n");
      out.write("\tvar condition = $(\"#searchCondition\").val();\n");
      out.write("\tvar searchText = $(\"#searchText\").val();\n");
      out.write("\t\n");
      out.write("\tlocation.href = \"/mwp/searchBoard.do?condition=\" + condition +\"&searchText=\" + searchText;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<br> <br> <br> <br> <br> <br> <br>\n");
      out.write("\n");
      out.write("\t<div class = \"footer\">\n");
      out.write("\t\t<p>@copyright 2018</p>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
