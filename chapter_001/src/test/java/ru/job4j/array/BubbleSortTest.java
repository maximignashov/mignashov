package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 30.03.2017
* @version 1.0
*/
public class BubbleSortTest {
	/**
	* Test sort bubble array 5 length.
	*/
    @Test
    public void whenSortArrayWithFiveElementsThenSortedArray() {
        BubbleSort bubblesort = new BubbleSort();
        int[] array = new int[] {5, 1, 2, 7, 3};
        int[] sArray = new int[] {1, 2, 3, 5, 7};
        int[] result = bubblesort.sort(array);
        int[] expected = sArray;
        assertThat(result, is(expected));
    }
    /**
    * Test sort bubble array 10 length.
    */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubblesort = new BubbleSort();
        int[] array = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] sArray = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        int[] result = bubblesort.sort(array);
        int[] expected = sArray;
        assertThat(result, is(expected));
    }
}