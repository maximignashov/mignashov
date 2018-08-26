package sort;

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
}
