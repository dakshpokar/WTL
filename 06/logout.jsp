<%
    session.removeAttribute("username");
    session.removeAttribute("password");
    session.invalidate();
    out.println("You are successfully logged out!");
    response.sendRedirect("/index.html");
%>