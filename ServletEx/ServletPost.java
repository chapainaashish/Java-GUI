package ServletEx;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletPost extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        // Getting POST values
        String username = request.getParameter("username");
        String gender = request.getParameter("gender");
        String reading = request.getParameter("hobbies");
        out.print(username + "<br>" + gender + "<br>" + reading);

        // RequestDispatcher rd = request.getRequestDispatcher("url in urlmappping or index.html file");
        RequestDispatcher rd = request.getRequestDispatcher("getservlet");

        // include Dispatcher
        rd.include(request, response);

        // forward Dispatcher
        rd.forward(request, response);
    }
}
