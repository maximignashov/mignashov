package ru.job4j.strategy;

/**
 * Class Triangle.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 11.05.17
 */
public class Triangle implements Shape {
    /**
     * Drawing pic triangle in pseudographics.
     * @return String
     */
    @Override
    public String pic() {
        int h = 5;
        StringBuilder sB = new StringBuilder();
        int pWidth = h - 1 + h;
        for (int height = 1; height <= h; height++) {
            int spaces = h - height;
            int endPir = pWidth - spaces;
            for (int width = 1; width <= pWidth; width++) {
                if ((spaces < width) & (width <= endPir)) {
                    sB.append("$");
                } else {
                    sB.append(" ");
                }
            }
            if (height != h) {
                sB.append(System.getProperty("line.separator"));
            }
        }
        return sB.toString();
    }
}
