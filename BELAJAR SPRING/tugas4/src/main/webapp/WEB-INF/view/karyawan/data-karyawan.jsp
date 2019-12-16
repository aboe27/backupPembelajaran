<%--
  Created by IntelliJ IDEA.
  User: btpnsshifted
  Date: 12/14/2019
  Time: 12:24 PM
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
        <th>${judul}</th>
        <th>${judul}</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${list}" var="kryList">
        <tr>
            <td>
                <c:out value="${kryList}"/>
            </td>

            <td>
                <c:out value="${kryList}"/>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<button><a href="/karyawanDetail"> lihat Detail </a></button>

</body>
</html>
