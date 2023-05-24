<%-- 
    Document   : LoginForm
    Created on : 23 may. 2023, 21:53:29
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entry?action=Login" var="linkForm"></c:url>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="${linkForm}">
            <label>user:</label>
            <input type="text" name="user"/>
            <label>password:</label>
            <input type="password" name="password"/>            
            <input type ="submit" value="Login"/>
        </form>
    </body>
</html>
