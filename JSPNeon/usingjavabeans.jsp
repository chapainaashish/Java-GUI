<%@ page import="JSPNeon.JavaBeansEx" %>

<%-- Instantiate the JavaBean --%>
<jsp:useBean id="person" class="JSPNeon.JavaBeansEx" scope="session" />

<%-- Set the properties of the JavaBean using request parameters --%>
<jsp:setProperty name="person" property="name" param="name" />
<jsp:setProperty name="person" property="age" param="age" />

<!DOCTYPE html>
<html>
<head>
    <title>Person Information</title>
</head>
<body>
    <h2>Person Information</h2>
    <p>Name: <jsp:getProperty name="person" property="name" /></p>
    <p>Age: <jsp:getProperty name="person" property="age" /></p>
</body>
</html>
