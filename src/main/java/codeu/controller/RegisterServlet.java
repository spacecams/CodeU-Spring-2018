/*
 * RegisterServlet.java
 * This code uses the response.getWriter().println() function to output HTML<br>
 * directly from the servlet. Eventually we'll want to use a JSP file to render HTML,<br>
 * but for now we just want to get something working.
 */

package codeu.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet class responsible for user registration.
*/
public class RegisterServlet extends HttpServlet {

 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response)
     throws IOException, ServletException {

   response.getWriter().println("<h1>RegisterServlet GET request.</h1>");
 }
}