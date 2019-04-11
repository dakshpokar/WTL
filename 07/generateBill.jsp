<%@page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Generated Bill</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
<body>
    <table border="1px">
        <tr>
            <th>Item</th>
            <th>Quantity</th>
            <th>Price</th>
            <%
        Map <String, String[]> params;
            params = request.getParameterMap();
            int quantity = 0;
            double price = 0.0;
            double total = 0.0;
            for(String para : params.keySet()){
                if(para.contains("item")){
                    out.println("</tr>");
                    out.println("<tr>");
                }
                if(para.contains("quant")){
                    quantity = Integer.parseInt(request.getParameter(para));
                }
                if(para.contains("price")){
                    price = Integer.parseInt(request.getParameter(para)) * quantity;
                    total = total + price;
                    out.println("<td>");
                    out.println(price);
                    out.println("</td>");
                }
                else{
                out.println("<td>");
                out.println(request.getParameter(para));
                out.println("</td>");
                }
            }
            out.println("<tr>");
            out.println("<td>");
            out.println("<strong>Total</strong>");
            out.println("</td>");
            out.println("<td>");
            out.println("</td>");
            out.println("<td>");
            out.println(total);
            out.println("</td>");
            out.println("</tr>");
            
    %>
    </table>
</body>
</html>
