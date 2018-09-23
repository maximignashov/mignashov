package ru.job4j.testdepartment;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Class Department.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 08.09.2018
 */
public class Department {
    /**
     * Отсортировать по возрастанию.
     *
     * @param departments исходный список департаментов.
     * @return отсортированный список департаментов.
     */
    public final List<String> sortAsc(final List<String> departments) {
        return this.recHierarchy(departments);
    }
    /**
     * Отсортировать по убыванию.
     *
     * @param departments исходный список департаментов.
     * @return отсортированный список департаментов.
     */
    public final List<String> sortDesc(final List<String> departments) {
        List<String> toSort = this.recHierarchy(departments);
        Set<String> sortedSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(final String o1, final String o2) {
                int minimal = Math.min(o1.length(), o2.length());
                int result = 0;
                for (int index = 0; index < minimal; index++) {
                    Character leftChar = o1.charAt(index);
                    Character rightChar = o2.charAt(index);
                    result = rightChar.compareTo(leftChar);
                    if (result != 0) {
                        break;
                    }
                }
                return result == 0 ? o1.length() - o2.length() : result;
            }
        });
        sortedSet.addAll(toSort);

        return sortedSet.stream().collect(Collectors.toList());
    }
    /**
     * Восстановить департаменты.
     *
     * @param departments исходный список департаментов.
     * @return список департаментов.
     */
    private List<String> recHierarchy(final List<String> departments) {
        Set<String> departmentsSet = new TreeSet<>();
        departmentsSet.addAll(departments);

        for (String department : departments) {
            for (int j = 0; j < department.length(); j++) {
                if (department.charAt(j) == '\\') {
                    departmentsSet.add(department.substring(0, j));
                }
            }
        }
        return departmentsSet.stream().collect(Collectors.toList());
    }
}
