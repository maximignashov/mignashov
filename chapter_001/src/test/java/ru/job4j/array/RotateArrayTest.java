package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 01.04.2017
* @version 1.0
*/
public class RotateArrayTest {
    /**
    * Test rotate array 2x2.
    */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotatearray = new RotateArray();
        int[][] array = new int[][] {{1, 2}, {3, 4}};
        int[][] rArray = new int[][] {{3, 1}, {4, 2}};
        int[][] result = rotatearray.rotate(array);
        int[][] expected = rArray;
        assertThat(result, is(expected));
    }
	/**
	* Test rotate array 3x3.
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotatearray = new RotateArray();
        int[][] array = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rArray = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] result = rotatearray.rotate(array);
        int[][] expected = rArray;
        assertThat(result, is(expected));
    }
}