<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	단일데이타<br/>
	<c:out value="${str1}"/><br/>
	${str1}<br/>
	
	<c:if test="${not empty list1}">
	리스트 데이타 <br/>
	<c:forEach var="data" items="${list1}">
	${data}<br/>
	</c:forEach>
	<c:forEach var="data" items="${list2}">
	${data}<br/>
	</c:forEach>
	</c:if>
	<c:if test="${not empty map1}">
	맵 데이타 <br/>
	${map1.name1} ${map2.sex1}<br/>
	${map1.name2} ${map2.sex2}<br/>
	${map1.name3} ${map2.sex3}<br/>
	${map1.name4} ${map2.sex4}<br/>
	${map1.name5} ${map2.sex4}<br/>
	</c:if>
	
	<c:if test="${not empty list2}">
		리스트 맵 형태 데이타 </br>
		<table>
		<c:forEach var="data" items="${list2}"
		varStatus="status">
		<tr>
		<th> no </th>
		<th> key1 </th>
		<th> key2 </th>
		<th> key3 </th>
		<th> key4 </th>
		<th> key5 </th>
		<tr>
		<td>${data.key1}</td>
		<td>${data.key2}</td>
		<td>${data.key3}</td>
		<td>${data.key4}</td>
		<td>${data.key5}</td>
		</c:forEach>
		</table>
	</c:if>	
</body>
</html>