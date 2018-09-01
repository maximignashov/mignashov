package ru.job4j.user;

import java.util.HashMap;
import java.util.List;

/**
 * Class UserConvert.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 18.08.2018
 */
public class UserConvert {
    /**
     * Переопределение метода compareTo.
     * @param list - коллекция.
     * @return HashMap.
     */
    public final HashMap<Integer, User> process(final List<User> list) {
        HashMap<Integer, User> users = new HashMap<>();
        for (User usr : list) {
            users.put(usr.getId(), usr);
        }
        return users;
    }
}
