<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="add.jsp">添加</a>
<table>
	<tr>
		<td>航线ID</td>
		<Td>航线名称</Td>
		<td>出发城市</td>
		<td>到达城市</td>
		<td>操作</td>
	</tr>
	
	<c:forEach items="${list }" var="hx">
	<tr>
		<td>${hx.hxid }</td>
		<Td>${hx.hxmc }</Td>
		<td>${hx.qfcs }</td>
		<td>${hx.ddcs }</td>
		<td>
			<a href="">删除</a>
			<a href="${hx.hxid }/toupdate.sw">修改</a>
		</td>
	</tr>
	
	
	
	</c:forEach>
</table>
</body>
</html>