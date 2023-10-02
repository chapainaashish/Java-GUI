package ServletEx;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/setCookie")
public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create a new cookie
        Cookie cookie1 = new Cookie("username", "aashish");

        // Set the cookie's expiration time (in seconds)
        // This example sets the cookie to expire after 1 hour (60 minutes * 60 seconds)
        cookie1.setMaxAge(60 * 60);

        // to destroy cookie
        cookie1.setMaxAge(0);

        // Add the cookie to the response
        response.addCookie(cookie1);

        // Send a response back to the client
        response.getWriter().println("Cookie set successfully!");


        // Getting a cookie
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();

        }
    }
}

