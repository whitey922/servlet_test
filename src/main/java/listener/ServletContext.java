package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//import static constants.ApplicationConstants.CALCULATOR_ATTRIBUTE_NAME;


public class ServletContext implements ServletContextListener {
//    private static final Logger LOGGER = Logger.getLogger(ServletContext.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("start");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("end");
    }
}
