<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    
    <!--  ��ҳ���ϵ���spring����ǩ -->
    
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

����ID<form:hidden path="hxid"/>
	��������<form:input path="hxmc"/> <br>
	��������<form:input path="qfcs"/><br>
	�������<form:input path="ddcs"/><br>
	��������<form:input path="cfrq"/><br>
	����ʱ��<form:input path="cfsj"/><br>
	<%--
	<form:radiobuttons path="cfsj" items="${zt }"/><br>
	<form:checkboxes items="${zt }" path="cfsj"/>
	<form:select path="hxid">
		<form:options items="${hxxx}" itemLabel="hxmc" itemValue="hxid"/>
	</form:select>
	 --%>
	 
	<input type="submit" value="�޸�"><br>


</form:form>
---------------------------------------
<form action="saveupdate.sw" method="post">
	����ID<input type="text" name="hxid" value="${hx.hxid }"><br>
	��������<input type="text" name="hxmc" value="${hx.hxmc }"><br>
	��������<input type="text" name="qfcs" value="${hx.qfcs }"><br>
	�������<input type="text" name="ddcs" value="${hx.ddcs }"><br>
	��������<input type="text" name="cfrq" value="${hx.cfrq }"><br>
	����ʱ��<input type="text" name="cfsj" value="${hx.cfsj }"><br>
	<input type="submit" value="�޸�"><br>
</form>
</body>
</html>