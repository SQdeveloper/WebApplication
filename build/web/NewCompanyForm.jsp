<%-- 
    Document   : NewCompanyForm
    Created on : 19 may. 2023, 19:31:17
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entry?action=NewCompany" var="linkForm"></c:url>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="${linkForm}">
            <label>Name:</label>
            <input type="text" name="name"/>
            <label>date:</label>
            <input type="text" name="date"/>            
            <input type ="submit" value="Send"/>
        </form>
    </body>
</html>
