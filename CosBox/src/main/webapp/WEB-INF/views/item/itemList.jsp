<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>itemList</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>상품ID</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${itemList}" var="item">
                <tr>
                    <td>${item.p_id}</td>
                    <td>${item.p_title}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
 
 
</body>
</html>