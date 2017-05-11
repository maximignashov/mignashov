package tracker.start;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 10.05.17
 */
public class StubInput implements Input {
    /**
     * array String[].
     */
    private String[] answers;
    /**
     * position of array.
     */
    private int position = 0;
    /**
     * Constructor.
     * @param answers array of answers
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }
    /**
     * Initialisation auto ask method.
     * @param question question for ask
     * @return ask
     */
    public String ask(String question) {
        return answers[position++];
    }
}
