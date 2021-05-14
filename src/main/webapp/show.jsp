<%--
  Created by IntelliJ IDEA.
  User: False
  Date: 2021/5/14
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Age</td>
            </tr>
            <c:forEach items="${requestScope.students}" var="student">
                <tr>
                    <td>${student.studentID}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
</html>
