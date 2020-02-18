<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Добавление нового продукта</title>
</head>
<body>
    <form:form action="resultForm" modelAttribute="product">
        id: <form:input path="id" />
        <br>
        tittle: <form:input path="tittle" />
        <br>
        cost: <form:input path="cost" />
        <br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
