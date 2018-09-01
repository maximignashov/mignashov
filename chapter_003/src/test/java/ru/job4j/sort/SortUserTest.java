package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class SortUserTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 25.08.2018
 */
public class SortUserTest {
    @Test
    public void whenSortUserAge() {
        List<User> usersList = new LinkedList<>();
        usersList.add(new User(12, "Ivan"));
        usersList.add(new User(15, "Maxim"));
        usersList.add(new User(14, "Igor"));
        usersList.add(new User(11, "Evgeniy"));

        SortUser sortUser = new SortUser();

        Set<User> currentTreeSet = sortUser.sort(usersList);

        assertThat(((User) currentTreeSet.toArray()[0]).getAge(), is(11));
    }
    @Test
    public void whenSortNameLength() {
        List<User> usersList = new LinkedList<>();
        usersList.add(new User(11, "Ivanov"));
        usersList.add(new User(15, "Maxim"));
        usersList.add(new User(14, "Igor"));
        usersList.add(new User(11, "Evgeniy"));

        SortUser sortUser = new SortUser();

        List<User> currentList = sortUser.sortNameLength(usersList);

        assertThat(currentList.get(0).getName(), is("Igor"));
    }
    @Test
    public void whenSortByAllFields() {
        List<User> usersList = new LinkedList<>();
        usersList.add(new User(25, "Сергей"));
        usersList.add(new User(30, "Иван"));
        usersList.add(new User(20, "Сергей"));
        usersList.add(new User(25, "Иван"));

        SortUser sortUser = new SortUser();

        List<User> currentList = sortUser.sortByAllFields(usersList);

        assertThat(currentList.get(0).getName(), is("Иван"));
        assertThat(currentList.get(0).getAge(), is(25));
        assertThat(currentList.get(1).getName(), is("Иван"));
        assertThat(currentList.get(1).getAge(), is(30));
    }
}
