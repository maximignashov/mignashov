package ru.job4j.tracker.models;

/**
 * Class Task.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.04.17
 */
public class Task extends Item {
    /**
     * Constructor.
     * @param name task name
     * @param desc task description
     */
    public Task(String name, String desc) {
        super.setName(name);
        super.setDescription(desc);
    }
}
