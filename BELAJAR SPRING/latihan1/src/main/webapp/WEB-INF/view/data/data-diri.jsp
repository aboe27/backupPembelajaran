<%--
  Created by IntelliJ IDEA.
  User: btpnsshifted
  Date: 12/13/2019
  Time: 5:25 PM
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
    <h2>Contoh form</h2>
<form action="/listLooping">
    Nama : <br>
    <input type="text" name="firstname" value="<c:out value="${firstname}"/>"> <br>
    Nama Full : <br>
    <input type="text" name="firstname" value="<c:out value="${fullname}"/>">
    <br><br>
    <input type="submit" value="Submit">

    <span><c:out value="${message}"/></span>

</form>


</body>
</html>
