<html>
<body>
    <h1>Jsp basic</h1>

    Directive Tag (Used to import class)
    <%@page import="java.util.Random, java.util.ArrayList" %>


    <jsp:include page="header.html" />
    <%@ include file="header.html" %>


    Scriplet Tag(Used for Display)
    <%
        out.print("Hi from JSP");
        out.print("Same like template in DJango");
    %>

    Declarative Tag (Used for variable and method declaration)
    <%!
        int a=10;
        String name = "Home";
    %>

    Expression tag
    <%= request.getAttribute("sum") %>"
</body>
</html>