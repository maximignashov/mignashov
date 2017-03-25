package ru.job4j.max;

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
public class MaxTest {
	/**
	* Test positive.
	*/
    @Test
    public void whenPositiveFiveAndPositiveOneThenMaxFive() {
        Max maximum = new Max();
        int result = maximum.max(5, 1);
        int expected = 5;
        assertThat(result, is(expected));
    }

    /**
	* Test negative.
	*/
    @Test
    public void whenNegativeTenAndNegativeEightThenMaxNegativeEight() {
        Max maximum = new Max();
        int result = maximum.max(-10, -8);
        int expected = -8;
        assertThat(result, is(expected));
    }

    /**
	* Test positive and negative.
	*/
    @Test
    public void whenPositiveOneAndNegativeFourThenMaxPositiveOne() {
        Max maximum = new Max();
        int result = maximum.max(1, -5);
        int expected = 1;
        assertThat(result, is(expected));
    }
}