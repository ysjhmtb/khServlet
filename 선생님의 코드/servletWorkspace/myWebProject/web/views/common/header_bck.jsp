<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.java.member.model.vo.MemberVo"%>
<!DOCTYPE html>
<html>
<head>
<%
	MemberVo member = (MemberVo)session.getAttribute("user");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/mwp/js/jquery-3.3.1.min.js"></script>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>
<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
<style>
	body{
		background:url("/mwp/images/background.jpg") no-repeat;
		background-size:cover;
	}
	.wrap{
		background:black;
		width:100%;
		height:50px;
	}
	.menu{
		background:black;
		color:white;
		width:150px;
		height:50px;
		vertical-align:middle;
		text-align:center;
		display:table-cell;
	}
	.nav{
		width:600px;
		margin-left:auto;
		margin-right:auto;
	}
	.menu:hover{
		background:lightgray;
		color:orangered;
		font-weight:bold;
		cursor:pointer;
	}
	
	.loginArea > #loginForm, .userInfo{
		float:right;
	}
	
	#memberLoginBtn, #memberJoinBtn, #memberInfoBtn, #memberLogoutBtn{
		display:inline-block;
		vertical-align:middle;
		text-align:center;
		cursor:pointer;
		width:150px;
		height:30px;
		border-radius:5px;
		background:orangered;
		color:white;
	}
	
	.tile{
		width:150px;
		height:150px;
		background:black;
		display:inline-block;
	}
	.first-line{
		margin-top:10%;
	}
	
	.tile-menu:hover{
		background:skyblue;
		cursor:pointer;
		color:white;
	}
	.notile{
		visibility:hidden;
	}
	.tile1{
		background:darkgray;
	}
	.footer{
		position:fixed;
		left:0;
		bottom:0;
		background:brown;
		color:white;
		text-align:center;
		width:100%;
	}
	
</style>
<script>
	function login(){
		$("#loginForm").submit();
	}
	
	function logout(){
		location.href = "/mwp/logout.do";		
	}
	
	function join(){
		location.href = "/mwp/views/member/memberJoin.jsp";
	}
	
	function mainPage(){
		//request.getContextPath() - /mwp
		//location.href = "/mwp/index.jsp";
		console.log('${pageContext.request.contextPath}');
		location.href = "${pageContext.request.contextPath}/index.jsp";
	}
	
	function myInfo(){
// 		console.log(localStorage);
// 		localStorage.removeItem("kakao_2e2524e541bae9363d7d85d3d3fbde83");
		//Kakao.Auth.getStatus(function(status){
		//	console.log(status.user.kaccount_email);
		//});
//		location.href = "../member/memberUpdate.jsp";
		location.href = "/mwp/views/member/memberUpdate.jsp";
	}
	
	function noticePage(){
		location.href = "/mwp/noticeList.do";
	}
	
	function boardPage(){
		location.href = "<%=request.getContextPath()%>/boardList.do";
	}
	//     /mwp -> context path
	function galleryPage(){
		location.href = "/mwp/galleryList.do";		
	}
	var naverLogin;
	$(function(){
		Kakao.init('3a3c19b17c6dccaf7fbcfb062df5d924');
	    // 카카오 로그인 버튼을 생성합니다.
	    Kakao.Auth.createLoginButton({
	      container: '#kakao-login-btn',
	      success: function(authObj) {
	      	alert(JSON.stringify(authObj));
	      },
	      fail: function(err) {
	         alert(JSON.stringify(err));
	      }
	    });
	    
	    naverLogin = new naver.LoginWithNaverId(
    		{
    			clientId: "STokf_c_5b9UupTwNlO1",
    			callbackUrl: "http://localhost:8081/mwp/index.jsp",
    			isPopup: true, /* 팝업을 통한 연동처리 여부 */
    			callbackHandle: true,
    			loginButton: {color: "green", type: 3, height: 60} /* 로그인 버튼의 타입을 지정 */
    		}
    	);
    	
    	/* 설정정보를 초기화하고 연동을 준비 */
    	naverLogin.init();
    	
    	naverLogin.getLoginStatus(function (status) {
    		if (status) {
    			close();
    		} else {
    			console.log("AccessToken이 올바르지 않습니다.");
    		}
    	});
	});
	
	
	function kakao_logout(){
		Kakao.Auth.logout();
		//페이지 이동
		//다른 로직
	}
	
	
	$(function(){
		//keyup - enterkey
		$("#pwdText").change(function(){
			$("#loginForm").submit();
		});	
	})
	function ajaxPage(){
		location.href = "/mwp/views/ajax/ajaxStudy.jsp"	;	
	}
	function storagePage(){
		location.href = "/mwp/views/api/localStorage.jsp";	
	}
	function mapPage(){
		location.href = "/mwp/views/api/map.jsp";
		
	}
	function confirmEmail(){
		naverLogin.getLoginStatus(function (status) {
			if (status) {
				var email = naverLogin.user.getEmail();
				console.log(email);
			} else {
				console.log("AccessToken이 올바르지 않습니다.");
			}
		});
	}
	function naverLogout(){
		$.ajax({
			type:"post",
			dataType:"text/html",
			url:"http://nid.naver.com/nidlogin.logout",
			crossdomain:true,
			xhrFields:{
				withCredentials:true
			},success:function(data){
				alert("로그아웃 성공");
			}
		});
	}
	function testShowInfo(){
		$.ajax({
			url:"http://kopis.or.kr/openApi/restful/pblprfr",
			data:{service:'effdcee65e9a465e850e00ac59bc2cad',
					stdate:20170101,
					eddate:20170731,
					cpage:1,
					rows:999,
					shcate:'AAAA'},
			type:"get",
			success:function(data){
				console.log(data);
				console.log($.parseXML(data));
			}
		});
	}
	function testgogo(obj){
		var reader = new FileReader();
		reader.onload = function(e){
			console.log(e.target.result);
		}
		reader.readAsText(obj.files[0]);
	}
</script>
</head>
<body>
	<h1 align="center">My Web Project</h1>
	<div class="loginArea">
	<%if(member == null){ %>
		<form id="loginForm" action="/mwp/login.au" method="post">
			<table>
				<tr>
					<td>아이디 : </td>
					<td>
						<input type="text" name="userId"/>
					</td>
				</tr>
				<tr>
					<td>비밀번호 : </td>
					<td>
						<input type="password" name="userPwd" id="pwdText"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div id="memberLoginBtn" onclick="login();">로그인</div>
						<div id="memberJoinBtn" onclick="join();">회원가입</div>
					</td>
				</tr>
			</table>		
		</form>
		<%}else{%>
			<div class="userInfo">
				<p><%=member.getUserName()%>님 방문을 환영 합니다.</p>
				<div id="memberInfoBtn" onclick="myInfo();">정보 수정</div>
				<div id="memberLogoutBtn" onclick="logout();">로그 아웃</div>
			</div>
		<%} %>
	</div>
	<a id="kakao-login-btn"></a>
<!-- 	<a href="http://developers.kakao.com/logout">로그아웃</a> -->
	<button onclick="kakao_logout();">카카오 로그아웃</button>
	<br>
	<div id="naverIdLogin"></div>
	<button onclick="confirmEmail();">이메일 확인</button>
	<button onclick="naverLogout();">네이버 로그아웃</button>
	<br>
	<br>
	<button onclick="testShowInfo();">데이터 요청</button>
	<input type="file" onchange="testgogo(this);"/>
	<br>
	<br>
	<div class="wrap">
		<div class="nav">
			<div class="menu" onclick="mainPage();">HOME</div>
			<div class="menu" onclick="noticePage();">Notice</div>
			<div class="menu" onclick="boardPage();">Board</div>
			<div class="menu" onclick="galleryPage();">Gallery</div>
			<div class="menu" onclick="ajaxPage();">Ajax</div>
			<div class="menu" onclick="storagePage();">Storage</div>
			<div class="menu" onclick="mapPage();">Map</div>
		</div>
	</div>
</body>
</html>









