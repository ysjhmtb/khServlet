/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-06-22 10:40:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.ajax;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajaxStudy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<title>ajax study</title>\n");
      out.write("<script type=\"text/javascript\" src=\"/mwp/js/jquery-3.3.1.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(function(){\n");
      out.write("\t\t$(\"#submit1\").click(function(){\n");
      out.write("\t\t\tvar name = $(\"#username\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test1.do\", \n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {username : name},\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(\"성공!!\");\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(\"요청 실패!!\");\n");
      out.write("\t\t\t\t},complete : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(\"무조건 실행 되는 함수!!\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit2\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test2.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\t$(\"#message\").val(data);\n");
      out.write("\t\t\t\t},error : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit3\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test3.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {num1 : $(\"#firstNum\").val(), num2 : $(\"#secondNum\").val()},\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\t$(\"#outputDiv1\").text(data);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#checkIdBtn\").click(function(){\n");
      out.write("\t\t\tvar inputId = $(\"#userId\").val();\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/idCheck.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tdata : {userId : inputId},\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\t$(\"#outputDiv2\").text(data);\n");
      out.write("\t\t\t\t\tif(data == \"사용가능한 아이디 입니다.\"){\n");
      out.write("\t\t\t\t\t\t$(\"#outputDiv2\").css(\"color\", \"green\");\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t$(\"#outputDiv2\").css(\"color\", \"red\");\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit4\").click(function(){\n");
      out.write("\t\t\tvar jsonData = new Object();\n");
      out.write("\t\t\tjsonData.food1 = $(\"#food1\").val();\n");
      out.write("\t\t\tjsonData.food2 = $(\"#food2\").val();\n");
      out.write("\t\t\tjsonData.food3 = $(\"#food3\").val();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test4.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tdata : jsonData,\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(\"전송 성공\");\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t//서버에서 전송값 문자열 타입의 경우만 json으로 파싱 되는 이유\n");
      out.write("\t\t$(\"#submit5\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test5.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar result = data.id + \"/\" + data.age + \"/\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ data.addr + \"/\" + data.email + \"/\" + data.gender;\n");
      out.write("\t\t\t\t\t$(\"#outputDiv3\").text(result);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit6\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test6.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tdata : {index:$(\"#userIndex\").val()},\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar user;\n");
      out.write("\t\t\t\t\tvar resultStr = \"\";\n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tuser = data[key];\n");
      out.write("\t\t\t\t\t\tresultStr += user.userId + \"/\" + user.age + \"/\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+decodeURIComponent(user.username) + \"<br>\"; \n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$(\"#outputDiv4\").html(resultStr);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(\"error\", e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit7\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test7.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tdata : {ids : $(\"#userIndexes\").val()},\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar user;\n");
      out.write("\t\t\t\t\tvar resultStr = \"\";\n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tuser = data[key];\n");
      out.write("\t\t\t\t\t\tresultStr += user.userId + \"/\" + user.age + \"/\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+decodeURIComponent(user.username) + \"<br>\"; \n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$(\"#outputDiv5\").html(resultStr);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(\"error\", e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit8\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test8.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar resultHtml = \"\";\n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tresultHtml += \"<option value='\" + data[key].userId + \"'>\";\n");
      out.write("\t\t\t\t\t\tresultHtml += decodeURIComponent(data[key].username);\n");
      out.write("\t\t\t\t\t\tresultHtml += \"</option>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tconsole.log(resultHtml);\n");
      out.write("\t\t\t\t\t$(\"#selectUserList1\").html(resultHtml);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e)\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\t$(\"#selectNameBtn\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/userList.do\",\n");
      out.write("\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar resultHtml = \"\";\n");
      out.write("\t\t\t\t\tvar username = \"\"; \n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tusername = decodeURIComponent(data[key].username);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tresultHtml += \"<option \"; \n");
      out.write("\t\t\t\t\t\tresultHtml += username == $(\"#selectName\").val() ? \" selected \" : \"\";\n");
      out.write("\t\t\t\t\t\tresultHtml += \"value='\" + data[key].userId + \"'>\";\n");
      out.write("\t\t\t\t\t\tresultHtml += username;\n");
      out.write("\t\t\t\t\t\tresultHtml += \"</option>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\tconsole.log(resultHtml);\n");
      out.write("\t\t\t\t\t$(\"#selectUserList2\").html(resultHtml);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e)\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit9\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test8.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar $tbody = $(\"#userListTable1 tbody\");\n");
      out.write("\t\t\t\t\t$.each(data, function(index, value){\n");
      out.write("\t\t\t\t\t\tconsole.log(value);\n");
      out.write("\t\t\t\t\t\tvar $tr = $(\"<tr>\");\n");
      out.write("\t\t\t\t\t\tvar $idTd = $(\"<td>\").text(value.userId);\n");
      out.write("\t\t\t\t\t\tvar $nameTd = $(\"<td>\").text(decodeURIComponent(value.username));\n");
      out.write("\t\t\t\t\t\tvar $ageTd = $(\"<td>\").text(value.age);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$tr.append($idTd);\n");
      out.write("\t\t\t\t\t\t$tr.append($nameTd);\n");
      out.write("\t\t\t\t\t\t$tr.append($ageTd);\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t$tbody.append($tr);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit10\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test10.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar user;\n");
      out.write("\t\t\t\t\tvar $select = $(\"#userListSelect2\");\n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tuser = data[key];\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tvar $option = $(\"<option>\");\n");
      out.write("\t\t\t\t\t\t$option.val(user.userId);\n");
      out.write("\t\t\t\t\t\t$option.text(user.userName);\n");
      out.write("\t\t\t\t\t\t$select.append($option);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#submit11\").click(function(){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\turl : \"/mwp/test11.do\",\n");
      out.write("\t\t\t\ttype : \"get\",\n");
      out.write("\t\t\t\tsuccess : function(data){\n");
      out.write("\t\t\t\t\tconsole.log(data);\n");
      out.write("\t\t\t\t\tvar $table = $(\"#outputTable\");\n");
      out.write("\t\t\t\t\tvar resultStr = \"<tr><th>아이디</th><th>이름</th>\" + \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"<th>나이</th></tr>\";\n");
      out.write("\t\t\t\t\tfor(var key in data){\n");
      out.write("\t\t\t\t\t\tconsole.log(key);\n");
      out.write("\t\t\t\t\t\tvar user = data[key];\n");
      out.write("\t\t\t\t\t\tresultStr += \"<tr>\";\n");
      out.write("\t\t\t\t\t\tresultStr += \"<td>\" + user.userId + \"</td>\";\n");
      out.write("\t\t\t\t\t\tresultStr += \"<td>\" + user.userName + \"</td>\";\n");
      out.write("\t\t\t\t\t\tresultStr += \"<td>\" + user.age + \"</td>\";\n");
      out.write("\t\t\t\t\t\tresultStr += \"</tr>\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t$table.html(resultStr);\n");
      out.write("\t\t\t\t},error : function(e){\n");
      out.write("\t\t\t\t\tconsole.log(e);\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Ajax Study!!!</h1>\n");
      out.write("\t\n");
      out.write("\t<h3>1. 화면에 값 입력 후 서버 전송</h3>\n");
      out.write("\t이름 : <input type=\"text\" id=\"username\" /><br>\n");
      out.write("\t<button id=\"submit1\">서버 전송</button>\n");
      out.write("\t<hr>\n");
      out.write("\t<h3>2. 서버에서 전송 값 화면 출력</h3>\n");
      out.write("\t<button id=\"submit2\">서버 전송</button><br>\n");
      out.write("\t메세지 : <input type=\"text\" id=\"message\"/>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>3. 화면에서 값 전송 후 해당 값 처리 결과 화면 출력</h3>\n");
      out.write("\t<p>숫자 2개를 전송 -> 두수의 합</p>\n");
      out.write("\t첫번째 숫자 : <input type=\"text\" id=\"firstNum\"/><br>\n");
      out.write("\t두번째 숫자 : <input type=\"text\" id=\"secondNum\"/><br>\n");
      out.write("\t<button id=\"submit3\">서버 전송</button>\n");
      out.write("\t<div id=\"outputDiv1\" style=\"border:1px solid red; height:auto;\"></div>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>실습1. 아이디 중복 체크</h3>\n");
      out.write("\t아이디 : <input type=\"text\" id=\"userId\"/> <button id=\"checkIdBtn\">중복체크</button>\n");
      out.write("\t<div id=\"outputDiv2\" style=\"border:1px solid red; height:auto;\"></div>\n");
      out.write("\t\n");
      out.write("\t<h3>4. 화면에서 객체로 데이터 전달</h3>\n");
      out.write("\t메뉴1 : <input type=\"text\" id=\"food1\"/><br>\n");
      out.write("\t메뉴2 : <input type=\"text\" id=\"food2\"/><br>\n");
      out.write("\t메뉴3 : <input type=\"text\" id=\"food3\"/><br>\n");
      out.write("\t<button id=\"submit4\">서버 전송</button>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>5. 서버에서 객체로 데이터 전달</h3>\n");
      out.write("\t<button id=\"submit5\">서버 전송</button>\n");
      out.write("\t<div id=\"outputDiv3\" style=\"border:1px solid red; height:auto;\"></div>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>6. 서버에서 리스트 형태의 데이터 전달</h3>\n");
      out.write("\t인덱스 : <input type=\"text\" id=\"userIndex\"/><br>\n");
      out.write("\t<button id=\"submit6\">서버 전송</button>\n");
      out.write("\t<div id=\"outputDiv4\" style=\"border:1px solid red; height:auto;\"></div>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>7. 요청 값을 검색 하여 해당 결과 리스트로 반환</h3>\n");
      out.write("\t<p>검색할 인덱스 1 / 2,5,8</p>\n");
      out.write("\t인덱스 : <input type=\"text\" id=\"userIndexes\"/><br>\n");
      out.write("\t<button id=\"submit7\">서버 전송</button>\n");
      out.write("\t<div id=\"outputDiv5\" style=\"border:1px solid red; height:auto;\"></div>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>8. 전체 리스트를 select의 option 항목에 추가</h3>\n");
      out.write("\t<button id=\"submit8\">서버 전송</button>\n");
      out.write("\t<select id=\"selectUserList1\"></select>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>실습2. 이름 입력 -> 해당 목록에서 해당 이름의 option 선택하기</h3>\n");
      out.write("\t이름 : <input type=\"text\" id=\"selectName\"/> \n");
      out.write("\t<button id=\"selectNameBtn\">서버 전송</button><br>\n");
      out.write("\t<select id=\"selectUserList2\"></select>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>9. 전체 리스트를 표 형식으로 출력</h3>\n");
      out.write("\t<button id=\"submit9\">서버 전송</button><br>\n");
      out.write("\t<table id=\"userListTable1\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>아이디</th>\n");
      out.write("\t\t\t\t<th>이름</th>\n");
      out.write("\t\t\t\t<th>나이</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("\t\t<tbody>\n");
      out.write("\t\t</tbody>\n");
      out.write("\t</table>\n");
      out.write("\t<hr>\n");
      out.write("\t\n");
      out.write("\t<h3>10. Gson 이용해서 list 출력</h3>\n");
      out.write("\t<button id=\"submit10\">서버 전송</button><br>\n");
      out.write("\t<select id=\"userListSelect2\"></select>\n");
      out.write("\t<hr>\n");
      out.write("\t\t\n");
      out.write("\t<h3>11. Gson 이용해서 Map 출력</h3>\n");
      out.write("\t<button id=\"submit11\">서버 전송</button>\n");
      out.write("\t<table id=\"outputTable\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>아이디</th>\n");
      out.write("\t\t\t<th>이름</th>\n");
      out.write("\t\t\t<th>나이</th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
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
