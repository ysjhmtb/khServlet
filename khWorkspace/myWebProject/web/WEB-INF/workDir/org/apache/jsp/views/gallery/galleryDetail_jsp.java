/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-06-22 12:15:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.java.gallery.model.vo.AttachmentVo;
import java.util.ArrayList;
import com.kh.java.member.model.vo.MemberVo;

public final class galleryDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/gallery/../common/header.jsp", Long.valueOf(1529566873000L));
    _jspx_dependants.put("/views/gallery/../common/footer.jsp", Long.valueOf(1527851360000L));
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
    _jspx_imports_classes.add("com.kh.java.gallery.model.vo.AttachmentVo");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

	ArrayList<AttachmentVo> list = (ArrayList<AttachmentVo>)request.getAttribute("list");
	AttachmentVo mainImage = list.get(0);
	AttachmentVo detailImage1 = list.get(1);
	AttachmentVo detailImage2 = list.get(2);
	AttachmentVo detailImage3 = list.get(3);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>이미지 게시판 상세보기</title>\n");
      out.write("<style>\n");
      out.write(".outer{\n");
      out.write("\twidth:1000px;\n");
      out.write("\theight:1000px;\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("\tmargin-top:50px;\n");
      out.write("}\n");
      out.write(".titleImageArea{\n");
      out.write("\twidth:500;\n");
      out.write("\theight:300;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table, table tr, table td{\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".detailImageArea{\n");
      out.write("\twidth:300px;\n");
      out.write("\theight:200px;\n");
      out.write("\tmargin:auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#replyArea{\n");
      out.write("\twidth:1000px;\n");
      out.write("\tmargin-bottom:50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".commentWriteArea{\n");
      out.write("\twidth:1000px;\n");
      out.write("\tbackground:black;\n");
      out.write("\tcolor:white;\n");
      out.write("\tmargin-left:auto;\n");
      out.write("\tmargin-right:auto;\n");
      out.write("\tmargin-bottom:80px;\n");
      out.write("}\n");
      out.write("li{\n");
      out.write("\tbackground:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul{\n");
      out.write("\tpadding:0px;\n");
      out.write("\tlist-style:none;\n");
      out.write("}\n");
      out.write("</style>\n");
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
      out.write("\tfunction ajaxPage(){\n");
      out.write("\t\tlocation.href = \"/mwp/views/ajax/ajaxStudy.jsp\";\n");
      out.write("\t\t\n");
      out.write("\t}\n");
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
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"mainPage();\">HOME</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"noticePage();\">공지사항</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"boardPage();\">게시판</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"galleryPage()\">사진 게시판</div>\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"ajaxPage()\">Ajax</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<div class=\"outer\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>제목</td>\n");
      out.write("\t\t\t<td colspan=\"5\">");
      out.print(mainImage.getTitle());
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>작성자</td>\n");
      out.write("\t\t\t<td>");
      out.print(mainImage.getUsername());
      out.write("</td>\n");
      out.write("\t\t\t<td>작성일</td>\n");
      out.write("\t\t\t<td>");
      out.print(mainImage.getWriteDate());
      out.write("</td>\n");
      out.write("\t\t\t<td>다운로드 횟수</td>\n");
      out.write("\t\t\t<td>");
      out.print(mainImage.getDownloadCount());
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>대표 사진</td>\n");
      out.write("\t\t\t<td colspan=\"5\">\n");
      out.write("\t\t\t\t<div class=\"titleImageArea\" align=\"center\">\n");
      out.write("\t\t\t\t\t<img src=\"/mwp/upload_gallery/");
      out.print(mainImage.getChangeName());
      out.write("\"/><br>\n");
      out.write("\t\t\t\t\t<a href=\"/mwp/upload_gallery/");
      out.print(mainImage.getChangeName());
      out.write("\" download><button>다운로드</button></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>내용</td>\n");
      out.write("\t\t\t<td colspan=\"5\">");
      out.print(mainImage.getContent());
      out.write("</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<div class=\"detailImageArea\" align=\"center\">\n");
      out.write("\t\t\t\t\t<img width=\"200\" height=\"200\" src=\"/mwp/upload_gallery/");
      out.print(detailImage1.getChangeName());
      out.write("\"/><br>\n");
      out.write("\t\t\t\t\t<a href=\"/mwp/upload_gallery/");
      out.print(detailImage1.getChangeName());
      out.write("\" download><button>다운로드</button></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<div class=\"detailImageArea\" align=\"center\">\n");
      out.write("\t\t\t\t\t<img width=\"200\" height=\"200\"  src=\"/mwp/upload_gallery/");
      out.print(detailImage2.getChangeName());
      out.write("\"/><br>\n");
      out.write("\t\t\t\t\t<a href=\"/mwp/upload_gallery/");
      out.print(detailImage2.getChangeName());
      out.write("\" download><button>다운로드</button></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<div class=\"detailImageArea\" align=\"center\">\n");
      out.write("\t\t\t\t\t<img width=\"200\" height=\"200\"  src=\"/mwp/upload_gallery/");
      out.print(detailImage3.getChangeName());
      out.write("\"/><br>\n");
      out.write("\t\t\t\t\t<a href=\"/mwp/upload_gallery/");
      out.print(detailImage3.getChangeName());
      out.write("\" download><button>다운로드</button></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t<br>\n");
      out.write("\t");
if(null != member){ 
      out.write("\n");
      out.write("\t<div class=\"commentWriteArea\">\n");
      out.write("\t\t<form method=\"post\" id=\"commentForm\" action=\"writeComment.do\">\n");
      out.write("\t\t\t<table width=\"800\">\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"bno\" id=\"bno\" value=\"");
      out.print(mainImage.getBno());
      out.write("\"/>\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"writer\"\tid=\"writer\" value=\"");
      out.print(member.getUserId() );
      out.write("\"/>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<textarea cols=\"90\" rows=\"4\" name=\"content\" id=\"content\"></textarea>\n");
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
      out.write("\t<div id=\"replyArea\">\n");
      out.write("\t\t<ul id=\"replyList\">\n");
      out.write("<!-- \t\t\t<li>아이디(이름) - 작성한 내용</li>\t\t\t -->\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
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
      out.write("<script>\n");
      out.write("\n");
      out.write("\t$(function(){\n");
      out.write("\t\t//댓글 목록 조회 servlet 호출\n");
      out.write("\t\t//화면에 반영\n");
      out.write("\t\tvar $replyList = $(\"#replyList\");\n");
      out.write("\t   var str = \"<span>testtest</span>\";\n");
      out.write("\t   $replyList.text(str);\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\tfunction writeComment(){\n");
      out.write("\t\tvar bno = $(\"#bno\").val();\n");
      out.write("\t\tvar writer = $(\"#writer\").val();\n");
      out.write("\t\tvar content = $(\"#content\").val();\n");
      out.write("\t\t\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl : \"/mwp/writeCommentGallery.do\",\n");
      out.write("\t\t\ttype : \"get\",\n");
      out.write("\t\t\tdata : {bno : bno, writer : writer, content : content},\n");
      out.write("\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\tvar $replyList = $(\"#replyList\");\n");
      out.write("\t\t\t\t$replyList.find(\"li\").remove();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\tvar comment = data[key];\n");
      out.write("\t\t\t\t\tvar $li = $(\"<li>\");\n");
      out.write("\t\t\t\t\t//아이디(이름) - 작성한 내용\n");
      out.write("\t\t\t\t\t$li.text(comment.writer + \n");
      out.write("\t\t\t\t\t\t\t\"(\" + comment.writerNm + \") - \" + comment.content);\n");
      out.write("\t\t\t\t\t$replyList.append($li);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}, error : function(e){\n");
      out.write("\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("</script>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
