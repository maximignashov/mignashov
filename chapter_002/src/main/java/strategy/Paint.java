package strategy;

/**
 * Class Paint.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 11.05.17
 */
public class Paint {
    /**
     * draw square or triangle.
     * @param shape triangle or square
     */
    public void draw(Shape shape) {
        System.out.println(shape.pic());
    }
}
