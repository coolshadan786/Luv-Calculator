<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>registration Success Page</title>
</head>
<body>
	<h1>Your Registration is Successful</h1>
	<h2>The details entered by you are : </h2>
	
	Name : 		${userReg.name}<br/>
	User Name : ${userReg.userName}<br/>
	Password :  ${userReg.password}<br/>
	Country :   ${userReg.countryName}<br/>
	Hobbies :

	<c:forEach var="temp" items="${userReg.hobbies}">
		${temp}
	
	</c:forEach>
	
	<br/>
	
	Gender :    ${userReg.gender}<br/>
			
	
</body>
</html>