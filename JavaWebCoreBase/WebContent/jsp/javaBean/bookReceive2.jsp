<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="com.wen.javawebcore.*"%>
	<jsp:useBean id="book" class="com.wen.javawebcore.BookBean">
	<jsp:setProperty name="book" property="bookName" param="bookName" />  
	 <jsp:setProperty name="book" property="bookNum" param="bookNum" /> 
	
	
	
	</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<hr />
	书 名：<jsp:getProperty property="bookName" name="book" />
	<br /> 数 量：<jsp:getProperty property="bookNum" name="book" />
	<br />
</body>
</html>