<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
<form action="saveadd.sw" method="post">
	����ID<input type="text" name="hxid"><br>
	��������<input type="text" name="hxmc"><br>
	��������<input type="text" name="qfcs"><br>
	�������<input type="text" name="ddcs"><br>
	��������<input type="text" name="cfrq"><br>
	����ʱ��<input type="text" name="cfsj"><br>
	<input type="submit" value="����"><br>
</form>

<form action="savefile.sw" method="post" enctype="multipart/form-data">
	�ļ�1��<input type="file" name="fs"><br>
	<input type="submit" value="�ϴ�����">
</form>
</body>
</html>