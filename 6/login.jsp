<!DOCTYPE html>
<html>
<%@ page import="java.util.*, java.io.*" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Processing your request...</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(session.isNew()){
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            out.println("\nWelcome to Dashboard");
        }
        else{
            String us = (String)session.getAttribute("username");
            String ps = (String)session.getAttribute("password");
            if(username == us && password == ps){
                out.println("You are already Logged In");
            }
            else{
                out.println("There is already one account logged in! \nPlease log that out by <a href=\"/logout.jsp\">Clicking here</a>");
            }
        }
    %>
</body>
</html>