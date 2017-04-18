<%--
  Created by IntelliJ IDEA.
  User: Zhao
  Date: 17/4/18
  Time: 下午8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int a=0;
        while(a<3){
    %>
    a=<%=a%>
    <%
        a++;
        }
    %>
</body>
</html>
