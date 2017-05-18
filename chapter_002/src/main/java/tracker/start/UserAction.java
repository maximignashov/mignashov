package tracker.start;

/**
 * Interface MenuAction.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
public interface UserAction {
    /**
     * key for select.
     * @return int number of menu
     */
    int key();
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    void execute(Input input, Tracker tracker);
    /**
     * menu.
     * @return String menu
     */
    String info();
}
