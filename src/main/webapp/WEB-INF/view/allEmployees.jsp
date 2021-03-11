<%@ taglib prefix="form" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>All Employees</title>
</head>
<body>
<h2>All Employees</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="emp" items="${employees}">

        <%--Ссылка на updateInfo с параметром id--%>
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <%--Ссылка на deleteEmployee с параметром id--%>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href = '/addEmployee'">

</body>
</html>
