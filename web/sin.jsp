sin.jsp is including content.jsp
<%
    int var=1;
    request.setAttribute("username","tom");
%>

<%@include file="content.jsp"%>

<p>sin.jsp is doing somthing else.</p>