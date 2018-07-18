package priority;

import java.util.LinkedList;

/**
 * Package for class PriorityQueue.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.07.2018
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод вставляет в нужную позицию элемент.
     * @param task задача
     */
    public void put(Task task) {
        int priority = task.getPriority();
        for (int i = 0; i < priority; i++) {
            if (priority == i + 1) {
               this.tasks.add(i, task);
            } else {
                this.tasks.add(task);
                priority = 0;
            }
        }
    }
    /**
     * Метод удаляет первый элемент из списка.
     * @return значение
     */
    public Task take() {
        return this.tasks.poll();
    }
}
