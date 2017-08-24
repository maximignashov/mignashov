package chess;

/**
 * Class FigureNotFoundException.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.08.17
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     * Constructor.
     * @param message message
     */
    public FigureNotFoundException(String message) {
        super(message);
    }
}
