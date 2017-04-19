<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 17/4/19
  Time: 上午6:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Source Page</title>
</head>
<body>
    <p>
        This is output of source.jsp before forward
    </p>
    <jsp:forward page="target.jsp">
        <jsp:param name="name" value="Tomcat"/>
    </jsp:forward>
    <p>
        This is output of source.jsp after forward
    </p>
</body>
</html>
