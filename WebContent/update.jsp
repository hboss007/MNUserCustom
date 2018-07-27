<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    
    <!--  在页面上导入spring表单标签 -->
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
<form:form action="${basePath }saveupdate.sw" method="put" commandName="hx">

航班ID<form:hidden path="hxid"/>
	航班名称<form:input path="hxmc"/> <br>
	出发城市<form:input path="qfcs"/><br>
	到达城市<form:input path="ddcs"/><br>
	出发日期<form:input path="cfrq"/><br>
	出发时间<form:input path="cfsj"/><br>
	<%--
	<form:radiobuttons path="cfsj" items="${zt }"/><br>
	<form:checkboxes items="${zt }" path="cfsj"/>
	<form:select path="hxid">
		<form:options items="${hxxx}" itemLabel="hxmc" itemValue="hxid"/>
	</form:select>
	 --%>
	 
	<input type="submit" value="修改"><br>


</form:form>
---------------------------------------
<form action="saveupdate.sw" method="post">
	航班ID<input type="text" name="hxid" value="${hx.hxid }"><br>
	航班名称<input type="text" name="hxmc" value="${hx.hxmc }"><br>
	出发城市<input type="text" name="qfcs" value="${hx.qfcs }"><br>
	到达城市<input type="text" name="ddcs" value="${hx.ddcs }"><br>
	出发日期<input type="text" name="cfrq" value="${hx.cfrq }"><br>
	出发时间<input type="text" name="cfsj" value="${hx.cfsj }"><br>
	<input type="submit" value="修改"><br>
</form>
</body>
</html>