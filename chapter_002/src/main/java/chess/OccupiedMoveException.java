package chess;

/**
 * Class {@link OccupiedMoveException}.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.08.17
 */
public class OccupiedMoveException extends RuntimeException {
    /**
     * Constructor.
     * @param message message
     */
    public OccupiedMoveException(String message) {
        super(message);
    }
}
