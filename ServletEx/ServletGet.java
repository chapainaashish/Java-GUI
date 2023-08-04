package ServletEx;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class ServletGet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Returning HTML content
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>This is heading 1 </h1>");
    }
}
