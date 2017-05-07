package tracker.start;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 06.05.17
 */
public interface Input {
    /**
     * initialisation.
     * @param question question for ask
     * @return String answer the question
     */
    String ask(String question);
}
