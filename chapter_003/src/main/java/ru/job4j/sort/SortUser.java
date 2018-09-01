package ru.job4j.sort;


import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

/**
 * Class SortUser.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.08.2018
 */
public class SortUser {
    /**
     * Сортирует List переводом в TreeSet.
     * @param list  - List<User>.
     * @return TreeSet<User>.
     */
    public final Set<User> sort(final List<User> list) {
        return new TreeSet<>(list);
    }
    /**
     * Сортирует List по длине имени.
     * @param list  - List<User>.
     * @return List<User>.
     */
    public final List<User> sortNameLength(final List<User> list) {
        List<User> userList = new LinkedList<>();
        userList.addAll(list);
        userList.sort(new Comparator<User>() {
            public int compare(final User o1, final User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return userList;
    }
    /**
     * Сортирует List по всем полям.
     * @param list  - List<User>.
     * @return List<User>.
     */
    public final List<User> sortByAllFields(final List<User> list) {
        List<User> userList = new LinkedList<>();
        userList.addAll(list);
        userList.sort(new Comparator<User>() {
            public int compare(final User o1, final User o2) {
                int reslt = 0;
                int nameSort = o1.getName().compareTo(o2.getName());
                if (nameSort != 0) {
                    reslt = nameSort;
                } else {
                    reslt = Integer.compare(o1.getAge(), o2.getAge());
                }
                return reslt;
            }
        });
        return userList;
    }
}
