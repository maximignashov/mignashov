package strategy;

/**
 * Class Square.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 11.05.17
 */
public class Square implements Shape {
    /**
     * Drawing pic square in pseudographics.
     * @return String
     */
    @Override
    public String pic() {
        int h = 5;
        StringBuilder sB = new StringBuilder();
        for (int index = 1; index <= h; index++) {
            for (int width = 1; width <= h; width++) {
                if (width == h) {
                    sB.append(System.getProperty("line.separator"));
                } else {
                    sB.append(" # ");
                }
            }
        }
        return sB.toString();
    }
}
