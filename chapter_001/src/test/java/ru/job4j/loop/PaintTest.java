package ru.job4j.loop;

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
public class PaintTest {
	/**
	* Test draw pyramid height 2.
	*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
    /**
    * Test draw pyramid height 3.
    */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
    /**
    * Test draw pyramid height 5.
    */
    @Test
    public void whenPiramidWithHeightFiveThenStringWithFiveRows() {
        Paint paint = new Paint();
        String result = paint.piramid(5);
        String expected = String.format("    ^    %s   ^^^   %s  ^^^^^  %s ^^^^^^^ %s^^^^^^^^^", System.getProperty("line.separator"),
            System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}