<%-- 
    Document   : testpage
    Created on : Feb 9, 2015, 12:36:30 AM
    Author     : a
--%>

<%@page import="hibernatemodels.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
        User ivm = (User)request.getSession().getAttribute("test");
        out.print("pass:"+ivm.getPassword());
        %>
    </body>
</html>
