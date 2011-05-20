<%@page import="com.guidewire.commons.handy.HandyUtil" %>
<html>
    <head>
        <title>Claim Center</title>
    </head>
    <body>
        <h1>Hi, welcome to Claim Center Webapp.</h1>
    </body>
<%
    HandyUtil handy = new HandyUtil();
%>

<%= handy.reverseString(new Double(Math.random()).toString())%>

</html>
