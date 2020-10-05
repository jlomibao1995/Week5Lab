package model;

import java.util.ArrayList;

/**
 *
 * @author Jean
 */
public class AccountService {

    private ArrayList<User> users;

    public AccountService() {
        users = new ArrayList<>();
        users.add(new User("abe", "password"));
        users.add(new User("barb", "password"));
    }

    public User login(String username, String password) {
        User loginUser = null;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loginUser = new User(username, "");
            }
        }
        return loginUser;
    }

}
