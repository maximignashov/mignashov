package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
* Test condition.
*
* @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
* @since 28.03.2017
* @version 1.0
*/
public class TriangleTest {
	/**
	* Test area triangle when is Triangle.
	*/
    @Test
    public void whenAIsThreeAndBIsSixAndCIsFiveThenAreaSevenFortyEight() {
        Point a = new Point(15, 3);
        Point b = new Point(2, 200);
        Point c = new Point(3, 2);

        Triangle triangle = new Triangle(a, b, c);
        double except = 1188.5;
        double result = triangle.area();
        assertThat(result, closeTo(except, 0.01));
    }
    /**
    * Test not Triangle.
    */
    @Test
    public void whenAIsOneAndBIsSixAndCIsFiveThenAreaMinusOne() {
        Point a = new Point(1, 1);
        Point b = new Point(-5, -2);
        Point c = new Point(3, 2);

        Triangle triangle = new Triangle(a, b, c);
        double except = -1D;
        double result = triangle.area();
        assertThat(result, is(except));
    }
}