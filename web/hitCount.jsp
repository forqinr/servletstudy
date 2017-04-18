<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 17/4/18
  Time: 下午9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    You hit the page:
    <%!
        int hitCount = 0;
    %>
    <%
        hitCount++;
    %>
    <%= hitCount %>
    times.
</body>
</html>
