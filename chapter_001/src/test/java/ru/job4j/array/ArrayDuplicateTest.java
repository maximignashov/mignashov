package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 03.04.2017
* @version 1.0
*/
public class ArrayDuplicateTest {
    /**
    * Test remove duplicates.
    */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate dupl = new ArrayDuplicate();
        String[] array = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] rArray = new String[] {"Привет", "Мир", "Супер"};
        String[] result = dupl.remove(array);
        String[] expected = rArray;
        assertThat(result, is(expected));
    }
}