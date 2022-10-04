<%-- 
    Document   : home.jsp
    Created on : Oct 3, 2022, 1:12:28 PM
    Author     : jheid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello ${username}!</h1>
        <a href="home?action=logout">Logout</a>
    </body>
</html>
