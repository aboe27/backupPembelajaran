<%--
  Created by IntelliJ IDEA.
  User: btpnsshifted
  Date: 12/13/2019
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" width="600px" align="center" >

        <thead>
        <tr>
            <th>${univ}</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${listMahasiswa}" var="mhsList">
        <tr>
            <td>
                <c:out value="${mhsList}"/>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>

<h2>${univ}</h2>

<form action="listLooping">
    <c:forEach items="${listMahasiswa}" var="mhsList">
    <span>
        <c:out value="${mhsList}"/>
    </span>
    </c:forEach>

</body>
</html>
