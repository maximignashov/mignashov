package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 11.05.17
 */
public class PaintTest {
    /**
     * Test triangle.
     */
    @Test
    public void whenPaintDrawTriangleThenDrawTriangle() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Triangle());
        assertThat(out.toString(),
                is(String.format("    $    %s   $$$   %s  $$$$$  %s $$$$$$$ %s$$$$$$$$$%s",
                        System.getProperty("line.separator"), System.getProperty("line.separator"),
                        System.getProperty("line.separator"), System.getProperty("line.separator"),
                        System.getProperty("line.separator"))));
    }
    /**
     * Test square.
     */
    @Test
    public void whenPaintDrawSquareThenDrawSquare() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Square());
        assertThat(out.toString(),
                is(String.format(" #  #  #  # %s #  #  #  # %s #  #  #  # %s #  #  #  # %s #  #  #  # %s%s",
                        System.getProperty("line.separator"), System.getProperty("line.separator"),
                        System.getProperty("line.separator"), System.getProperty("line.separator"),
                        System.getProperty("line.separator"), System.getProperty("line.separator"))));
    }
}
