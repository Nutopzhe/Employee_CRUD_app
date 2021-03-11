<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h2>Employee Info</h2>
<form:form action="saveEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Surname:</td>
            <td><form:input path="surname"/></td>
        </tr>
        <tr>
            <td>Department:</td>
            <td><form:input path="department"/></td>
        </tr>
        <tr>
            <td>Salary:</td>
            <td><form:input path="salary"/></td>
        </tr>
    </table>
    <input type="submit" value="Ok">
</form:form>

</body>
</html>
