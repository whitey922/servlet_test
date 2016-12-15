package listener;

import domain.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

import static constans.ApplicationConstant.USER;

//import static constants.ApplicationConstants.CALCULATOR_ATTRIBUTE_NAME;


public class ServletContext implements ServletContextListener {
    //    private static final Logger LOGGER = Logger.getLogger(ServletContext.class);
    private static Map<String, User> stringUserMap = null;

    public static Map<String, User> getMap() {
        return stringUserMap;
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("start");
        stringUserMap = new HashMap<>();

        User userFirst = new User("login", "password", "123", 1243, "name", "surname");
        User userSecond = new User("login1", "password1", "123", 1243, "name", "surname");
        sce.getServletContext().setAttribute(USER, userFirst);
        sce.getServletContext().setAttribute(USER, userSecond);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("end");
    }

}
