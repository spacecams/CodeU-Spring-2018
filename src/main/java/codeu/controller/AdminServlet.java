/*
 * AdminServlet.java
 * This code uses the request.getRequestDispatcher() function to output the
 * register.jsp file
 */

package codeu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* Servlet class resposible for admin page.
*/

public class AdminServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
      request.getRequestDispatcher("/WEB-INF/view/admin.jsp").forward(request, response);
  }
}
