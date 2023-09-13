<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sum Calculator</title>
</head>
<body>
    <h1>Sum Calculator</h1>
    <form method="post">
        <label for="num1">Enter first number:</label>
        <input type="number" id="num1" name="num1">
        <br>
        <label for="num2">Enter second number:</label>
        <input type="number" id="num2" name="num2">
        <br>
        <label for="result">Sum:</label>
        <input type="text" id="result" name="result" value="<%= request.getAttribute("sum") %>">
        <br>
        <input type="submit" value="Calculate">
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("post")) {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;
            request.setAttribute("sum", sum);
        }
    %>
</body>
</html>
