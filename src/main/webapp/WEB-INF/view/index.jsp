<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >

<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Product base</h1>

<a href="/form">Add product</a>
<br>
<a href="/allProducts">Show All products</a>
<%--<form:form action="form">--%>
<%--    <input type="submit" value="Add product" />--%>
<%--</form:form>--%>
<%--<form:form action="allProducts">--%>
<%--    <input type="submit" value="Show All products" />--%>
<%--</form:form>--%>

</body>
</html>