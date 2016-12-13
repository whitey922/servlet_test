package logic;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User:Anton_Iehorov
 * Date: 12/13/2016
 * Time: 10:31 AM
 */

//@WebServlet("/test1")
public class TestServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println
                ("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head><title>A TestServlet Servlet</title></head>\n" +
                        "<body bgcolor=\"#fdf5e6\">\n" +
                        "<h1>TestServlet</h1>\n" +
                        "<p>Simple servlet for testing.</p>\n" +
                        "</body></html>");
    }
}
