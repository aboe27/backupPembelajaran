<%--
  Created by IntelliJ IDEA.
  User: btpnsshifted
  Date: 12/15/2019
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="600px" align="center" >

    <thead>
    <tr>
        <th>tes</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${krynama}" var="kryList">
        <tr>
            <td>
                <c:out value="${kryList}"/>
            </td>
        </tr>
    </c:forEach>

    </tbody>

</body>
</html>
