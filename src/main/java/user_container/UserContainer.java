package user_container;

import domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * User:Anton_Iehorov
 * Date: 12/15/2016
 * Time: 2:40 PM
 */
public class UserContainer {
    private static UserContainer userContainer;
    private Map<String, User> users = new HashMap<>();

    public static UserContainer getInstance() {
        if (userContainer == null) userContainer = new UserContainer();
        return userContainer;
    }

    /***
     *
     * @return users
     */
    public Map<String, User> getUsers() {
        return users;
    }

    public void addUsers(User user) {
        if (isPresent(user))
            users.put("test", user);
    }

    private boolean isPresent(User enterUser) {
        for (Map.Entry<String, User> user : users.entrySet()) {
            if (user.getValue().getLogin().equals(enterUser.getLogin())) return true;
        }

        return false;
    }

    private void initUsers() {
        users.put("1", new User("login", "password", "email", "phone", "name", "surname"));
    }

}
