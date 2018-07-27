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
	航班ID<input type="text" name="hxid"><br>
	航班名称<input type="text" name="hxmc"><br>
	出发城市<input type="text" name="qfcs"><br>
	到达城市<input type="text" name="ddcs"><br>
	出发日期<input type="text" name="cfrq"><br>
	出发时间<input type="text" name="cfsj"><br>
	<input type="submit" value="新增"><br>
</form>

<form action="savefile.sw" method="post" enctype="multipart/form-data">
	文件1：<input type="file" name="fs"><br>
	<input type="submit" value="上传附件">
</form>
</body>
</html>