<%--
  Created by IntelliJ IDEA.
  User: csa116
  Date: 3/11/21
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<form action="<%= request.getContextPath()%>/SiteController" method="post">
    Username: <input type="text" name="username" value="Enter username"><br/>
    Password: <input type="password" name="password"><br/>
    <input type="submit" value="submit">
</form>
</body>
</html>