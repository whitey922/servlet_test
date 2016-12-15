package logic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * User:Anton_Iehorov
 * Date: 12/14/2016
 * Time: 10:20 AM
 */
@WebServlet("/test2")
public class Test2Sservlet extends HttpServlet {
    ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("testParam", "testParam example");
        req.getSession().setAttribute("atrtibute", "0");
        String cookieName = "name";
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getValue());
                System.out.println(cookie.getPath());
                System.out.println(cookie.getSecure());
                System.out.println(cookie.getDomain());
                cookie.setMaxAge(0);
                resp.addCookie(cookie);
//                    System.out.println(cookie.get);

            }
        }
//        req.getSession().
//        Cookie cookie = new Cookie("name", "value");
//        cookie.setPath("path");
//        cookie.setMaxAge(0);


  //      getServletContext().getRequestDispatcher("/test.jsp").forward(req, resp);

    }
}
