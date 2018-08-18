package user;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class UserConvertTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 18.08.2018
 */
public class UserConvertTest {
    @Test
    public void whenListToHashMap() {
        List<User> list = new ArrayList<>();
        list.add(new User(324, "Alex", "Sankt-Peterbirg"));
        list.add(new User(325, "Ivan", "Moscow"));
        list.add(new User(326, "Maxim", "NizhniyNovgorod"));
        UserConvert convertToMap = new UserConvert();

        HashMap<Integer, User> currentHashMap = convertToMap.process(list);

        HashMap<Integer, User> endHashMap = convertToMap.process(list);
        endHashMap.put(324, list.get(0));
        endHashMap.put(325, list.get(1));
        endHashMap.put(326, list.get(2));

        assertThat(currentHashMap.get(325), is(list.get(1)));

    }
}
