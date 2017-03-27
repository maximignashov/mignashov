package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test condition.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 25.03.2017
* @version 1.0
*/
public class PointTest {
	/**
	* Test true.
	*/
    @Test
    public void whenXIsFourAndYIsEightThenTrue() {
        Point point = new Point(4, 6);
        assertThat(point.is(1, 2), is(true));
    }

    /**
	* Test false.
	*/
    @Test
    public void whenXIsThreeAndYIsEightThenFalse() {
        Point point = new Point(3, 6);
        assertThat(point.is(1, 2), is(false));
    }
}