package validator;

import domain.User;
import listener.ServletContext;

import java.util.Map;

/**
 * User:Anton_Iehorov
 * Date: 12/14/2016
 * Time: 4:12 PM
 */
public class UserValidatorAuth {

    /***
     *
     * @param login user's login
     * @param password user's password
     * @return authorization result
     */
    public static boolean isUserAuth(String login, String password) {
        return checkLogin(login) && checkPassword(password);
    }

    private static boolean checkLogin(String login) {
        Map<String, User> stringUserMap = ServletContext.getMap();

        for (Map.Entry<String, User> user: stringUserMap.entrySet()) {
            if(login.equals(user.getValue().getLogin())) return true;
        }
        return false;
    }

    private static boolean checkPassword(String password) {
        Map<String, User> stringUserMap = ServletContext.getMap();

        for (Map.Entry<String, User> user: stringUserMap.entrySet()) {
            if(password.equals(user.getValue().getPassword())) return true;
        }
        return false;
    }
}
