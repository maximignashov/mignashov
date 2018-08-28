package sort;

import java.util.*;

/**
 * Class SortUser.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.08.2018
 */
public class SortUser {
    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }
    public List<User> sortNameLength (List<User> list) {
        List<User> userList = new LinkedList<>();
        userList.addAll(list);
        userList.sort(new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return userList;
    }
    public List<User> sortByAllFields (List<User> list) {
        List<User> userList = new LinkedList<>();
        userList.addAll(list);
        userList.sort(new Comparator<User>() {
            public int compare(User o1, User o2) {
                int nameSort = o1.getName().compareTo(o2.getName());
                return nameSort != 0 ? nameSort : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return userList;
    }
}
