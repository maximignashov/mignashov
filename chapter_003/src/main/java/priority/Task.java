package priority;

/**
 * Package for class Task.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.07.2018
 */
public class Task {
    private String desc;
    private int priority;
    /**
     * Конструктор.
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
    /**
     * Get desc.
     * @return desc
     */
    public String getDesc() {
        return desc;
    }
    /**
     * Get priority.
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
}
