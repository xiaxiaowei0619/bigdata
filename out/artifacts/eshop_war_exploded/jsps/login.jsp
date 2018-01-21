<%--
  Created by IntelliJ IDEA.
  User: xiaxiaowei
  Date: 2018/1/2
  Time: 1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login.jsp</title>
  </head>
  <body>
  <form action="/doLogin" method="post">
    Username: <input type="text" name="name" ><br>
    Password: <input type="password" name="password"><br>
    <input type="submit"/>
  </form>
  </body>
</html>
