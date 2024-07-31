<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://jakarta.apache.org/taglibs/{library}" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
<%@ include file="header.jsp" %>
Welcome , user 


<%--using taglib directive  --%>


<x:hello/>
</body>
</html>