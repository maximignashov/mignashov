package user;

import java.util.HashMap;
import java.util.List;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 18.08.2018
 */
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> users = new HashMap<>();
        for (User usr : list) {
            users.put(usr.getId(), usr);
        }
        return users;
    }
}
