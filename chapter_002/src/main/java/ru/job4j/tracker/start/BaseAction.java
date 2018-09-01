package ru.job4j.tracker.start;

/**
 * Class BaseAction.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 30.05.17
 */
public abstract class BaseAction implements UserAction {
    /**
     * name menu action.
     */
    private String name;
    /**
     * key menu action.
     */
    private int key;
    /**
     * Constructor BaseAction.
     * @param name menu action
     * @param key key menu action
     */
    public BaseAction(String name, int key) {
        this.name = name;
        this.key = key;
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    public abstract void execute(Input input, Tracker tracker);
    /**
     * Display menu action.
     * @return String menu action
     */
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
