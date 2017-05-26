package tracker.start;

/**
 * Class StubInput.
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
     * default Constructor.
     */
    public StubInput() {
    }
    /**
     * Initialisation auto ask method.
     * @param question question for ask
     * @return ask
     */
    public String ask(String question) {
        return answers[position++];
    }
    /**
     * Initialisation number menu.
     * @param question question for ask
     * @param range array of menu numbers
     * @return number
     */
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of range");
        }
    }
}
