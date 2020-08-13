<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please register here</h1>
	
	<form:form action="registration-success" method="get" modelAttribute="userReg">
	<div align="center">
	<label>User : </label>
	<form:input path="name"/>
	
	<br/>
	
	<label>User Name : </label>
	<form:input path="userName" />
	
	<br/>
	<label>Password : </label>
	<form:input path="password" />
	
	<br/>
	
	<label>Country : </label>
	<form:select path="countryName">
		<form:option value="Ind" label="India"></form:option>
		<form:option value="Usa" label="USA"></form:option>
		<form:option value="Chi" label="China"></form:option>
		<form:option value="Pak" label="Pakistan"></form:option>
		<form:option value="Eng" label="England"></form:option>
		<form:option value="Sal" label="SriLanka"></form:option>			
	</form:select>
	
	<br/>
	
	<label>Hobbies  : </label>
	Cricket : <form:checkbox path="hobbies" value="cricket"/>
	Reading : <form:checkbox path="hobbies" value="reading"/>
	Travel : <form:checkbox path="hobbies" value="travel"/>
	Programming : <form:checkbox path="hobbies" value="programming"/>
	
	<br/>

	<label>Gender : </label>	
	Male<form:radiobutton path="gender" value="male"/>
	Female<form:radiobutton path="gender" value="female"/>
	
	<br/>
	
	<input type="submit" value="register"/>
	
	</div>
	
	</form:form>
	
</body>
</html>