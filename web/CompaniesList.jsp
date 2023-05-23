<%-- 
    Document   : CompaniesList
    Created on : 19 may. 2023, 20:06:59
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <c:forEach items="${companies}" var="cp">
                <li>${cp.name} - ${cp.date}
                    <a href="entry?action=UpdateForm&id=${cp.id}" > update</a>
                    <a href="entry?action=RemoveCompany&id=${cp.id}"> remove </a>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>