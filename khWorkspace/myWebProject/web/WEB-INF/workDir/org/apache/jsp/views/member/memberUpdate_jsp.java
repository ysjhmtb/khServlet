/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-06-11 09:00:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.java.member.model.vo.MemberVo;

public final class memberUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1528460731000L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1527851360000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.java.member.model.vo.MemberVo");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>내 정보 수정</title>\n");
      out.write("<script src=\"https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js\"></script>\n");
      out.write("<style>\n");
      out.write("\t.outer{\n");
      out.write("\t\twidth:600px;\n");
      out.write("\t\theight:500px;\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tmargin-left:auto;\n");
      out.write("\t\tmargin-right:auto;\n");
      out.write("\t\tpadding:20px;\n");
      out.write("\t\tborder:1px solid white;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#idCheckBtn, #searchAddressBtn, #joinMainBtn, #updateBtn, #deleteBtn{\n");
      out.write("\t\tbackground:orangered;\n");
      out.write("\t\tborder-radius:5px;\n");
      out.write("\t\twidth:100px;\n");
      out.write("\t\theight:25px;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t} \n");
      out.write("\t#joinMainBtn, #updateBtn, #deleteBtn {\n");
      out.write("\t\tdisplay:inline-block;\n");
      out.write("\t}\n");
      out.write("\t#searchAddressBtn, #updateBtn, #joinMainBtn{\n");
      out.write("\t\tbackground:yellowgreen;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("\tfunction memberJoin(){\n");
      out.write("\t\t$(\"#joinForm\").submit();\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction validate(){\n");
      out.write("\t\tif($(\"#userPwd\").val() != $(\"#userPwd2\").val()){\n");
      out.write("\t\t\t$(\"#passChkSpan\").text(\"비밀번호가 일치하지 않습니다.\");\n");
      out.write("\t\t\t$(\"#userPwd2\").focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t//다른 값들을 체크 하는 로직 추가(유효성 검사 로직 추가 영역)\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction openAddressPopup(){\n");
      out.write("\t\tnew daum.Postcode({\n");
      out.write("            oncomplete: function(data) {\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\n");
      out.write("\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\n");
      out.write("                var fullAddr = ''; // 최종 주소 변수\n");
      out.write("                var extraAddr = ''; // 조합형 주소 변수\n");
      out.write("\n");
      out.write("                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\n");
      out.write("                    fullAddr = data.roadAddress;\n");
      out.write("\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\n");
      out.write("                    fullAddr = data.jibunAddress;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.\n");
      out.write("                if(data.userSelectedType === 'R'){\n");
      out.write("                    //법정동명이 있을 경우 추가한다.\n");
      out.write("                    if(data.bname !== ''){\n");
      out.write("                        extraAddr += data.bname;\n");
      out.write("                    }\n");
      out.write("                    // 건물명이 있을 경우 추가한다.\n");
      out.write("                    if(data.buildingName !== ''){\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\n");
      out.write("                    }\n");
      out.write("                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.\n");
      out.write("                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\n");
      out.write("                //data.zonecode; //5자리 새우편번호 사용\n");
      out.write("                $(\"#zipcode\").val(data.zonecode);\n");
      out.write("                $(\"#address1\").val(fullAddr);\n");
      out.write("\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\n");
      out.write("                $(\"#address2\").focus();\n");
      out.write("            }\n");
      out.write("        }).open();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction updateMember(){\n");
      out.write("\t\t$(\"#updateForm\").submit();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");

	MemberVo member = (MemberVo)session.getAttribute("user");


      out.write("\n");
      out.write("\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("\tbody{\n");
      out.write("\t\tbackground:url(\"/mwp/images/background.jpg\") no-repeat;\n");
      out.write("\t\tbackground-size:cover;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.wrap{\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.menu{\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t\tvertical-align:middle;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tdisplay:table-cell;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.nav{\n");
      out.write("\t\twidth:600px;\n");
      out.write("\t\tmagin-left:auto;\n");
      out.write("\t\tmargin-right:auto;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.menu:hover{\n");
      out.write("\t\n");
      out.write("\t\tbackground:lightgray;\n");
      out.write("\t\tcolor:orangered;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.loginArea > #loginForm, .userInfo{\n");
      out.write("\t\tfloat:right;\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t#memberLoginBtn, #memberJoinBtn, #memberInfoBtn, #memberLogoutBtn {\n");
      out.write("\t\n");
      out.write("\t\tdisplay:inline-block;\n");
      out.write("\t\tvertical-align:middle;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:30px;\n");
      out.write("\t\tborder-radius:5px;\n");
      out.write("\t\tbackground:orangered;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.tile{\n");
      out.write("\t\n");
      out.write("\t\twidth:150px;\n");
      out.write("\t\theight:150px;\n");
      out.write("\t\tbackground:black;\n");
      out.write("\t\tdisplay:inline-block;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.first-line{\n");
      out.write("\t\tmargin-up:10%;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t.tile-menu:hover{\n");
      out.write("\t\n");
      out.write("\t\tbackground:skyblue;\n");
      out.write("\t\tcursor:pointer;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.notile{\n");
      out.write("\t\tvisibility:hidden;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.tile1{\n");
      out.write("\t\tbackground:darkgray;\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.footer{\n");
      out.write("\t\n");
      out.write("\t\tposition:fixed;\n");
      out.write("\t\tleft:0;\n");
      out.write("\t\tbottom:0;\n");
      out.write("\t\tbackground:brown;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\t<script\n");
      out.write("\t  src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("\t  integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\n");
      out.write("\t  crossorigin=\"anonymous\"></script>\n");
      out.write("\t  \n");
      out.write("\t<script>\n");
      out.write("\t\tfunction login(){\n");
      out.write("\t\t\t$(\"#loginForm\").submit();\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tfunction logout(){\n");
      out.write("\t\t\tlocation.href = \"/mwp/logout.do\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction join(){\n");
      out.write("\t\t\tlocation.href = \"/mwp/views/member/memberJoin.jsp\"\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction mainPage(){\n");
      out.write("\t\t\t//request.getContextPath() : /mwp\n");
      out.write("\t\t\t//location.href = \"/mwp/index.jsp\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\trequest.getContextPath() : 프로젝트의 context path 반환.\n");
      out.write("\n");
      out.write("\t\t\t/example\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\trequest.getRequestURI() : 웹 전체 경로 반환.\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t/example/index.jsp\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\trequest.getHeader(\"REFERER\") : 요청을 한 부모요청의 URL 반환.\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t현재 페이지 : localhost:8080/example/test1.do\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t요청 페이지 : localhost:8080/example/test.do\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tlocalhost:8080/example/test.do 반환.\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\trequest.getRealPath(\"/\") : 서버 또는 로컬의 웹앱 서버의 docBase 설정값 반환.\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t요청  : localhost:8080/example/test.jsp\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t반환 : D:/Project/webapps/example\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction myInfo(){\n");
      out.write("\t\t\tlocation.href = \"/mwp/views/member/memberUpdate.jsp\"\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tfunction noticePage(){\n");
      out.write("\t\t\tlocation.href = \"/mwp/noticeList.do\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$(\"#pwd\").change(function(){\n");
      out.write("\t\t\t\talert($(this).val());\n");
      out.write("\t\t\t});\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1 align = \"center\">My Web Project</h1>\n");
      out.write("\t<div class = \"loginArea\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");
if(member == null) {
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t<form id = \"loginForm\" action = \"/mwp/login.do\" method = \"post\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>id :</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input type = \"text\" name = \"userId\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>password :</td>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<input type = \"password\" name = \"userPwd\" id=\"pwd\">\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td colspan = \"2\">\n");
      out.write("\t\t\t\t\t\t<div id = \"memberLoginBtn\" onclick = \"login()\">sign in</div>\n");
      out.write("\t\t\t\t\t\t<div id = \"memberJoinBtn\" onclick = \"join()\">sign up</div>\n");
      out.write("\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\t");
} else{
      out.write("\n");
      out.write("\t\t\t<div class=\"userInfo\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<p>");
      out.print( member.getUserName() );
      out.write("님 방문을 환영합니다.</p>\n");
      out.write("\t\t\t\t<div id=\"memberInfoBtn\" onclick=\"myInfo();\">정보 수정.</div>\n");
      out.write("\t\t\t\t<div id=\"memberLogoutBtn\" onclick=\"logout();\">로그 아웃.</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
} 
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class = \"wrap\">\n");
      out.write("\t\t\t<div class = \"nav\">\n");
      out.write("\t\t\t\t<div class = \"menu\" onclick=\"mainPage()\">HOME</div>\n");
      out.write("\t\t\t\t<div class = \"menu\" onclick=\"noticePage()\">공지사항.</div>\n");
      out.write("\t\t\t\t<div class = \"menu\">게시판.</div>\n");
      out.write("\t\t\t\t<div class = \"menu\">사진 게시판.</div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("\t<br>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t<div class=\"outer\">\n");
      out.write("\t\t<h2 align=\"center\">회원 가입</h2>\n");
      out.write("\t\t<form id=\"updateForm\" method=\"post\" action=\"/mwp/updateMember.do\" \n");
      out.write("\t\t\t\t\tonsubmit=\"return validate();\" >\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td width=\"200px;\"><span class=\"import\">*</span>아이디</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId\" value=\"");
      out.print(member.getUserId());
      out.write("\" readonly/></td>\n");
      out.write("\t\t\t\t<td width=\"200px\"></td>\n");
      out.write("\t\t\t</tr>\t\t\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><span class=\"import\">*</span>변경 비밀번호</td>\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\" required/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><span class=\"import\">*</span>변경 비밀번호 확인</td>\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"userPwd2\" id=\"userPwd2\" required/></td>\n");
      out.write("\t\t\t\t<td><span id=\"passChkSpan\"></span></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><span class=\"import\">*</span>이름</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"userName\" id=\"userName\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(member.getUserName());
      out.write("\"/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>성별</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"M\"> 남성\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"F\"> 여성\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>나이</td>\n");
      out.write("\t\t\t\t<td><input type=\"number\" name=\"age\" min=\"10\" max=\"100\" \n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(member.getAge());
      out.write("\"/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>이메일</td>\n");
      out.write("\t\t\t\t<td><input type=\"email\" name=\"email\" value=\"");
      out.print(member.getEmail());
      out.write("\"/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>전화번호</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone1\" id=\"phone1\" size=\"2\"/>-\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone2\" id=\"phone2\" size=\"2\"/>-\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone3\" id=\"phone3\" size=\"2\"/>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>우편번호</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"zipcode\" id=\"zipcode\" readonly/></td>\n");
      out.write("\t\t\t\t<td><div id=\"searchAddressBtn\" onclick=\"openAddressPopup();\">주소 검색</div></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>주소</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"address1\" id=\"address1\" readonly/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>상세주소</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"address2\" id=\"address2\"/></td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>취미</td>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"game\" name=\"hobby\" value=\"게임\"/>\n");
      out.write("\t\t\t\t\t<label for=\"game\">게임</label>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"climbing\" name=\"hobby\" value=\"등산\"/>\n");
      out.write("\t\t\t\t\t<label for=\"climbing\">등산</label>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"sing\" name=\"hobby\" value=\"노래\"/>\n");
      out.write("\t\t\t\t\t<label for=\"sing\">노래</label>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"board\" name=\"hobby\" value=\"보드\"/>\n");
      out.write("\t\t\t\t\t<label for=\"board\">보드</label>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"read\" name=\"hobby\" value=\"독서\"/>\n");
      out.write("\t\t\t\t\t<label for=\"read\">독서</label>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" id=\"etc\" name=\"hobby\" value=\"기타\"/>\n");
      out.write("\t\t\t\t\t<label for=\"etc\">기타</label>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"btns\" align=\"center\">\n");
      out.write("\t\t\t<div id=\"joinMainBtn\" onclick=\"mainPage();\">메인으로</div>\t\t\n");
      out.write("\t\t\t<div id=\"updateBtn\" onclick=\"updateMember();\">회원 수정</div>\t\t\n");
      out.write("\t\t\t<div id=\"deleteBtn\" onclick=\"deleteMember();\">회원 탈퇴</div>\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(function(){\n");
      out.write("\t\t\t$(\"input:radio\").each(function(){\n");
      out.write("\t\t\t\tif($(this).val() == '");
      out.print(member.getGender());
      out.write("'){\n");
      out.write("\t\t\t\t\t$(this).prop(\"checked\", true);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar phones = '");
      out.print(member.getPhone());
      out.write("'.split('-');\n");
      out.write("\t\t\t$(\"input[name*=phone]\").each(function(index){\n");
      out.write("\t\t\t\t$(this).val(phones[index]);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar addrArr = '");
      out.print(member.getAddress());
      out.write("'.split(', ');\n");
      out.write("\t\t\t$(\"#zipcode\").val(addrArr[0]);\t\t\t\n");
      out.write("\t\t\t$(\"#address1\").val(addrArr[1]);\t\t\t\n");
      out.write("\t\t\t$(\"#address2\").val(addrArr[2]);\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar hobbies = '");
      out.print(member.getHobbyStr());
      out.write("'.split(', ');\n");
      out.write("\t\t\t$(\"input:checkbox\").each(function(index){\n");
      out.write("\t\t\t\tif(-1 < $.inArray($(this).val(), hobbies)){\n");
      out.write("\t\t\t\t\t$(this).prop(\"checked\", true);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\tfunction deleteMember(){\n");
      out.write("\t\t\tlocation.href = \"/mwp/deleteMember.do?userid=");
      out.print(member.getUserId());
      out.write("\";\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t");
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
