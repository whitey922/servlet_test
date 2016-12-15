package logic;

import validator.UserValidatorAuth;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User:Anton_Iehorov
 * Date: 12/13/2016
 * Time: 10:31 AM
 */

@WebServlet("/auth")
public class TestServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws
            ServletException, IOException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (UserValidatorAuth.isUserAuth(request.getParameter("login"), request.getParameter("password")))
            getServletContext().getRequestDispatcher("/main.html").forward(request, response);
        else
            getServletContext().getRequestDispatcher("/error.html").forward(request, response);
    }
}
