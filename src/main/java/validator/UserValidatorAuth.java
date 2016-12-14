package validator;

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
        return true;
    }

    private static boolean checkPassword(String password) {
        return true;
    }
}
