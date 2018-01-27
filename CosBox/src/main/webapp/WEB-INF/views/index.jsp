<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
<script type="text/javascript">
	
		// 필수 입력정보인 아이디, 비밀번호가 입력되었는지 확인하는 함수
		function goItemList()
		{
			location.href = "/cosbox/item/itemList.do";
		}
		
		function goMemberList()
		{
			location.href = "/cosbox/member/memberList.do";
		}
</script>
</head>
<body>
    <h1>Hello Cosbox!</h1>

    <input type="button" value="상품목록" onclick="goItemList()">
 	<input type="button" value="사용자목록" onclick="goMemberList()">
 
</body>
</html>