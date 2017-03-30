package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 24.03.2017
* @version 1.0
*/
public class TurnTest {
	/**
	* Test array even.
	*/
    @Test
    public void whenArrayLengthEvenThenTurnedBackNumbers() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int[] rArray = new int[] {6, 5, 4, 3, 2, 1};
        int[] result = turn.back(array);
        int[] expected = rArray;
        assertThat(result, is(expected));
    }
    /**
    * Test array odd.
    */
    @Test
    public void whenArrayLengthOddThenTurnedBackNumbers() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] rArray = new int[] {5, 4, 3, 2, 1};
        int[] result = turn.back(array);
        int[] expected = rArray;
        assertThat(result, is(expected));
    }
}