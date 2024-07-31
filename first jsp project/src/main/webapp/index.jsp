<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%--Using import page directive tag --%>
    <%@ page import="java.util.Date" %>
    
    <%--using session  in directive tag --%>
    <%-- <%@ page session="false"%>--%>
    
    <%--uses of isErrorPage --%>
  <%--  <%@ page isErrorPage="false"%>--%>
    
    <%--used the errorPage in directive tag --%>   
  <%--  <%@ page errorPage="ExceptionHandling.jsp"%>--%> 
    
    <%-- Here  I have used the content type tag in directive tags --%>
   <%-- <%@ page contentType="text/html"%>--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP Program to Understand all the tags</title>

<%-- Scriptlet tag--%>
	<%
        int count = 0;
	%>
<%-- Declaration tag--%>
	<%!
        int count = 0;
    %>
</head>
<body>
<%-- jsp comments --%>
<h5>Here we can use comment tag</h5>
<%-- Scriptlet tag--%>
<% out.println(" using Scriptlet tag"); %>
<br>
Page Count is: <% out.println(++count); %>
<br><br>
<%-- Declaration tag--%>
<% out.println(" using Declaration tag"); %>
<br>
Page Count is: <% out.println(++count); %>
<br>
<% out.println(" using Directive page import tag"); %>
<br>
Current Date: <%= new Date() %>
<br>
<%--Using expression tag  --%>
<%= (2*5) %>

<%--<%@ page info="This code is given by tejas" %> --%>
</body>
</html>