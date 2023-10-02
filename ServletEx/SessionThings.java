package ServletEx;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionThings extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        // Creating session object
        HttpSession session =  request.getSession(true);

        // Setting session
        session.setAttribute("username", "Aashish");
        session.setAttribute("password", "12345");

        // Getting session value
        String name = (String)session.getAttribute("username");
        String password = (String)session.getAttribute("password");

        // Forwarding
        RequestDispatcher rd = request.getRequestDispatcher("login");
        rd.forward(request, response);

        // Invalidate (destroy) the session
        session.invalidate();

    }
}
