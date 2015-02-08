<%-- 
    Document   : index
    Created on : Feb 6, 2015, 7:35:17 PM
    Author     : a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index.jsp</title>
    </head>
    <body>
        <h1>Welcome to teamWorkOP</h1>
        <form action="login" method="POST">
            <input type="textbox" required="" placeholder="Username" name="uname">
            <input type="password" required="" placeholder="12345" name="upass">
            <input type="submit" value="Login">
        </form>
        
        <br/>
        <br/>
        <br/>
        
        <form action="/search" method="POST">
            <input type="textbox" required="" placeholder="search" name="searchcrit">
            <input type="submit" value="Search">
        </form>
        
        <br/>
        <br/>
        <br/>
        
        <form action="/register" method="POST">
            <input type="submit" value="Register">
        </form>
        
        <br/>
        <br/>
        <br/>
        
        <form action="/forum">
            <input type="submit" value="Forum">
        </form>
        
    </body>
</html>
