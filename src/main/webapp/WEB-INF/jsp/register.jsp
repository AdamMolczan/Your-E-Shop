<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>User registration</title>
</head>
<body>

<h2>Rejestracja użytkownika</h2>
<form:form modelAttribute="member" method="POST" action="/addMember">
   <table>
    <tr>
        <td><form:label path="firstName">Imie</form:label></td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td><form:label path="lastName">Nazwisko</form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
        <tr>
        <td><form:label path="email">email</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Hasło</form:label></td>
        <td><form:input path="password" /></td>
    </tr>

    <tr>
        <td><form:label path="repassword">Powtórz hasło</form:label></td>
        <td><form:input path="repassword" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>