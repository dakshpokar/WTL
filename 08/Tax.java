import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import java.io.IOException;

public class Tax extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException{
        PrintWriter out = response.getWriter();
        Double amount = Double.parseDouble(request.getParameter("amount"));
        out.println("<h1>Amount: " + amount + "</h1>");
        Double tax = 0.0;
        if(amount >= 250000){
            if(amount <= 500000){
                tax = amount * 0.1;
            }
            else{
                tax = amount * 0.2;
            }
        }
        out.println("<h1>Tax: " + tax + "</h1>");
    }
}