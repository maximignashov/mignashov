package ru.job4j.convert;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class ConvertListTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 22.10.17
 */
public class ConvertListTest {
    /**
     * Test ru.job4j.convert List to Array.
     */
    @Test
    public void whenConvertArrayToList() {
        ConvertList conv = new ConvertList();
        List<Integer> arrayTolist;

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        arrayTolist = conv.toList(array);

        List<Integer> endList = new ArrayList<>();
        endList.add(1);
        endList.add(2);
        endList.add(3);
        endList.add(4);
        endList.add(5);
        endList.add(6);

        assertThat(arrayTolist, is(endList));
    }
    /**
     * Test ru.job4j.convert Array to List.
     */
    @Test
    public void whenConvertListToArray() {
        ConvertList conv = new ConvertList();

        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(4);
        listOfInteger.add(5);
        listOfInteger.add(6);
        listOfInteger.add(7);

        int[][] listToArray;
        listToArray = conv.toArray(listOfInteger, 3);

        int[][] endArray = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};

        assertThat(listToArray, is(endArray));
    }
    /**
     * Test ru.job4j.convert two List<int[]> to one List<Integer>.
     */
    @Test
    public void whenTwoListToOneList() {
        ConvertList conv = new ConvertList();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> result = conv.convert(list);

        List<Integer> endList = new ArrayList<>();
        endList.add(1);
        endList.add(2);
        endList.add(3);
        endList.add(4);
        endList.add(5);
        endList.add(6);

        assertThat(result, is(endList));
    }
}
