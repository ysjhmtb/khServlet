/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-06-19 07:29:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.kh.java.board.model.vo.CommentVo;
import com.kh.java.board.model.vo.BoardVo;
import com.kh.java.member.model.vo.MemberVo;

public final class boardDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/board/../common/header.jsp", Long.valueOf(1529060788000L));
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
    _jspx_imports_classes.add("com.kh.java.board.model.vo.CommentVo");
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

	BoardVo board = (BoardVo)request.getAttribute("board");
	ArrayList<CommentVo> cList = (ArrayList<CommentVo>)request.getAttribute("cList");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>게시글 상세 보기</title>\n");
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
      out.write("\twidth:800px;\t\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write(".tableArea table,.tableArea table td,.tableArea table th{\n");
      out.write("\tborder:1px solid white;\n");
      out.write("}\n");
      out.write(".commentArea{\n");
      out.write("\twidth:800px;\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("}\n");
      out.write(".commentWriteArea{\n");
      out.write("\twidth:800px;\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("\tmargin-bottom:50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("\tfunction bModifyPage(){\n");
      out.write("\t\tlocation.href=\"/mwp/updateBoardForm.do?boardNo=");
      out.print(board.getNo());
      out.write("\";\n");
      out.write("\t}\n");
      out.write("\tfunction deleteBoard(){\n");
      out.write("\t\tif(confirm(\"삭제 하시겠습니까?\")){\n");
      out.write("\t\t\tlocation.href=\"/mwp/deleteBoard.do?boardNo=");
      out.print(board.getNo());
      out.write("&fileName=");
      out.print(board.getAttachFile());
      out.write("\";\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\tfunction boardPageList(){\n");
      out.write("\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/boardList.do?currentPage=");
      out.print(request.getParameter("currentPage"));
      out.write("\";\n");
      out.write("\t}\n");
      out.write("\tfunction writeComment(){\n");
      out.write("\t\t$(\"#commentForm\").submit();\n");
      out.write("\t}\n");
      out.write("\tfunction updateCommentForm(obj, flag){\n");
      out.write("\t\tvar $textArea = $(obj).parent().parent().next().find(\"textarea\");\n");
      out.write("\t\t$textArea.prop(\"readonly\", !flag);\n");
      out.write("\t\tif(flag){\n");
      out.write("\t\t\t$(obj).hide();\n");
      out.write("\t\t\t$(obj).siblings(\".deleteBtn\").hide();\n");
      out.write("\t\t\t$(obj).siblings(\".updateBtn\").show();\n");
      out.write("\t\t\t$(obj).siblings(\".cancelBtn\").show();\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$(obj).siblings(\".modifyBtn\").show();\n");
      out.write("\t\t\t$(obj).siblings(\".deleteBtn\").show();\n");
      out.write("\t\t\t$(obj).siblings(\".updateBtn\").hide();\n");
      out.write("\t\t\t$(obj).hide();\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction updateComment(obj, cno){\n");
      out.write("\t\t//댓글 작성 -> 댓글 번호, 댓글 내용\n");
      out.write("\t\tvar commentValue =  $(obj).parent().parent().next().find(\"textarea\").val();\n");
      out.write("\t\tvar cno = cno;\n");
      out.write("\t\t//console.log(\"updateComment.do?cno=\" + cno + \"&content=\" + commentValue);\n");
      out.write("\t\tlocation.href\n");
      out.write("\t\t\t=\"updateComment.do?cno=\" + cno + \"&content=\" + commentValue + \"&bno=");
      out.print(board.getNo());
      out.write("\";\n");
      out.write("\t}\n");
      out.write("\tfunction deleteComment(cno){\n");
      out.write("\t\tvar cno = cno;\n");
      out.write("\t\t//console.log(\"updateComment.do?cno=\" + cno + \"&content=\" + commentValue);\n");
      out.write("\t\tlocation.href\n");
      out.write("\t\t\t=\"deleteComment.do?cno=\" + cno + \"&bno=");
      out.print(board.getNo());
      out.write("\";\n");
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
      out.write("\t\t\t<div class=\"menu\">사진 게시판</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<div class=\"outer\">\n");
      out.write("\t<h2 align=\"center\">게시글 상세 내용</h2>\n");
      out.write("\t<div class=\"tableArea\">\n");
      out.write("\t\t<table width=\"800\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>제목</th>\n");
      out.write("\t\t\t\t<td colspan=\"5\">");
      out.print(board.getTitle());
      out.write("</td>\n");
      out.write("\t\t\t</tr>\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th width=\"200\">작성자</th>\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getWriterName() );
      out.write("</td>\n");
      out.write("\t\t\t\t<th width=\"100\">조회수</th>\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getCount() );
      out.write("</td>\n");
      out.write("\t\t\t\t<th width=\"100\">작성일</th>\n");
      out.write("\t\t\t\t<td>");
      out.print(board.getWriteDate() );
      out.write("</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
if(null != board.getAttachFile()){ 
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>미리보기</th>\n");
      out.write("\t\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t\t<a target=\"_blank\" href=\"/mwp/upload/");
      out.print(board.getAttachFile());
      out.write("\">파일 미리보기</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>첨부파일(다운)</th>\n");
      out.write("\t\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t\t<a href=\"/mwp/fileDownload.do?filename=");
      out.print(board.getAttachFile());
      out.write('"');
      out.write('>');
      out.print(board.getAttachFile());
      out.write("</a>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
}else{ 
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>첨부파일</th>\n");
      out.write("\t\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t\t첨부파일이 존재하지 않습니다.\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>내용</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"6\">\n");
      out.write("\t\t\t\t\t<p>");
      out.print(board.getContent() );
      out.write("</p>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t<div align=\"center\">\n");
      out.write("\t\t<button onclick=\"boardPageList();\">목록으로</button>\n");
      out.write("\t\t");
if(null != member && member.getUserId().equals(board.getWriter())){ 
      out.write("\n");
      out.write("\t\t\t<button onclick=\"bModifyPage();\">수정하기</button>\n");
      out.write("\t\t\t<button onclick=\"deleteBoard();\">삭제하기</button>\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"commentArea\">\n");
      out.write("\t\t<table width=\"800\">\n");
      out.write("\t\t\t\t<!-- 이름(작성일)  ---------------------<수정하기, 삭제하기> -->\n");
      out.write("\t\t\t\t<!-- 댓글 내용 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->\n");
      out.write("\t\t\t");
for(CommentVo c : cList){ 
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>");
      out.print(c.getWriterNm() );
      out.write('(');
      out.print(c.getWriteDate() );
      out.write(")</td>\n");
      out.write("\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t");
if(member.getUserId().equals(c.getWriter())){ 
      out.write("\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"modifyBtn\" value=\"수정\" onclick=\"updateCommentForm(this, true);\"/>\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"deleteBtn\" value=\"삭제\" onclick=\"deleteComment(");
      out.print(c.getCno());
      out.write(");\"/>\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"updateBtn\" style=\"display:none;\" value=\"작성 완료\" onclick=\"updateComment(this,");
      out.print(c.getCno());
      out.write(");\"/>\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"cancelBtn\" style=\"display:none;\" value=\"취소\" onclick=\"updateCommentForm(this, false);\"/>\n");
      out.write("\t\t\t\t");
} 
      out.write("\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td colspan=\"2\">\n");
      out.write("\t\t\t\t\t<textarea cols=\"108\" rows=\"4\" readonly>");
      out.print(c.getContent() );
      out.write("</textarea>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\t");
if(member != null){ 
      out.write("\n");
      out.write("\t<div class=\"commentWriteArea\">\n");
      out.write("\t\t댓글\n");
      out.write("\t\t<form method=\"post\" id=\"commentForm\" action=\"writeComment.do\">\n");
      out.write("\t\t\t<table width=\"800\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"bno\" value=\"");
      out.print(board.getNo());
      out.write("\"/>\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"writer\"\tvalue=\"");
      out.print(member.getUserId() );
      out.write("\"/>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"90\" rows=\"4\" name=\"content\"></textarea>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<!-- <input type=\"submit\" value=\"댓글작성\"/> -->\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"writeComment();\" value=\"댓글작성\"/>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t");
} 
      out.write("\n");
      out.write("</div>\n");
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
