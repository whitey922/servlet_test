package logic;

import bean.NumberBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * User:Anton_Iehorov
 * Date: 12/14/2016
 * Time: 10:51 AM
 */
@WebServlet("/test")
public class RunNumberSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = new Random().nextInt(Integer.parseInt(req.getParameter("range")));
        String address = "/random.jsp";
        NumberBean bean = new NumberBean(number);
        req.setAttribute("randomNum", bean);
        RequestDispatcher dispatcher =
                req.getRequestDispatcher(address);
        dispatcher.forward(req, resp);
    }

}
