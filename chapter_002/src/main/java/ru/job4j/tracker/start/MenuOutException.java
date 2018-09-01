package ru.job4j.tracker.start;

/**
 * Class MenuOutException.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 20.05.17
 */
public class MenuOutException extends RuntimeException {
    /**
     * Constructor.
     * @param msg message
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
