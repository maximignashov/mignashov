package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 13.04.2017
* @version 1.0
*/
public class MergeTest {
	/**
	* Test two arrays.
	*/
    @Test
    public void whenTwoArrayThenOneMergedArray() {
        Merge merge = new Merge();
        int[] arrayOne = new int[] {1, 3, 6};
        int[] arrayTwo = new int[] {2, 4, 5};
        int[] mergedArray = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = merge.merge(arrayOne, arrayTwo);
        int[] expected = mergedArray;
        assertThat(result, is(expected));
    }
}