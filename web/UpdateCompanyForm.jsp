<%-- 
    Document   : UpdateCompanyForm
    Created on : 19 may. 2023, 21:09:17
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/UpdateCompany" var="linkUpdateCompany" ></c:url>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="${linkUpdateCompany}">
            <label>Name:</label>
            <input type="text" name="name" value="${cp.name}"/>
            <label>date:</label>
            <input type="text" name="date" value="${cp.date}"/>       
            <input type="hidden" name="id" value="${cp.id}">
            <input type ="submit" value="Send"/>
        </form>
    </body>
</html>
