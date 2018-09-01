package ru.job4j.chess;

/**
 * Class {@link ImpossiblleMoveException}.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 03.08.17
 */
public class ImpossiblleMoveException extends RuntimeException {
    /**
     * Constructor.
     * @param message message
     */
    public ImpossiblleMoveException(String message) {
        super(message);
    }
}
