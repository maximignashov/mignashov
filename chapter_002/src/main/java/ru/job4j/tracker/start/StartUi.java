package ru.job4j.tracker.start;

/**
 * Class StartUi.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 06.05.17
 */
public class StartUi {
    /**
     * Tracker object.
     */
    private Tracker tracker;
    /**
     * Input object.
     */
    private Input input;
    /**
     * Constructor.
     * @param tracker initialisation
     * @param input initialisation
     */
    public StartUi(Tracker tracker, Input input) {
        this.tracker = tracker;
        this.input = input;
    }
    /**
     * initialisation.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(input, tracker);
        menu.fillActions();
        int key;
        do {
            menu.show();
            key = input.ask("Select: ", menu.getRanges());
            menu.select(key);
        } while (key != 7);

    }
    /**
     * main method.
     * @param args default param
     */
    public static void main(String[] args) {
        StartUi start = new StartUi(new Tracker(), new ValidateInput());
        start.init();
    }
}
