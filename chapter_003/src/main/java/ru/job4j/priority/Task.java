package ru.job4j.priority;

/**
 * Class Task.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.07.2018
 */
public class Task {
    /**
     * Переменные класса Task.
     */
    private String desc; private int priority;
    /**
     * Конструктор.
     * @param curDesc     - текущее описание
     * @param curPriority - текущий приоритет
     */
    public Task(final String curDesc, final int curPriority) {
        this.desc = curDesc;
        this.priority = curPriority;
    }
    /**
     * Get desc.
     * @return desc
     */
    public final String getDesc() {
        return desc;
    }
    /**
     * Get Priority.
     * @return int
     */
    public final int getPriority() {
        return priority;
    }
}
