<html>
<body>
    <h1>Jsp basic</h1>

    Declarative Tag (Used to import class)
    <%@page import="java.util.Random, java.util.ArrayList" %>

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
</body>
</html>