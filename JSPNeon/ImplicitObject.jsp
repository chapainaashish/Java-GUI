<html>
<body>

    Implicit object are the objects that can be directly used in jsp without creating them explicitly like in
    servlet

    <%
        out.println("This is used to print the text");

        // get parameter from request body
        request.getParameter("name");

        // redirect to another page
        response.sendRedirect("home.jsp");

        // session (Return true or false)
        out.println(session.isNew());

        // setting session
        session.setAttribute("user", "Aashish");
        session.setAttribute("password", "12345");

        // destroying session
        session.invalidate();

        // getting session
        String user = (String)session.getAttribute("user");
        String password = (String)session.getAttribute("password");

    %>
</body>
</html>