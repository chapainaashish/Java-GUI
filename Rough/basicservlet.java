package Rough;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class basicservlet extends HttpServlet{
    public void doGet(HttpServletResponse response, HttpServletRequest request) throws ServletException,IOException{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("HI");
    }
}
