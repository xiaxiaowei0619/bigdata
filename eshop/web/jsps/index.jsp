<%--
  Created by IntelliJ IDEA.
  User: xiaxiaowei
  Date: 2018/1/2
  Time: 1:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
  <head>
    <title>index.jsp</title>
  </head>
  <body>
  <c:if test="${sessionScope.name == null}">
    <c:out value="${requestScope.error}"/>
  </c:if>
  <c:if test="${sessionScope.name != null}">
    欢迎<c:out value="${sessionScope.name}"/>
  </c:if>
  <a href="/toRegPage">用户注册</a>
  </body>
</html>
