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
        int size = this.tasks.size();
        if (size == 0) {
            this.tasks.add(task);
        } else {
            int priorityParam = task.getPriority();
            for (int i = 0; i < size; i++) {
                if (priorityParam < this.tasks.get(i).getPriority()) {
                    size = i;
                    this.tasks.add(i, task);
                }
            }
        }
    }
    /**
     * Метод удаляет и выводит первый элемент из списка.
     * @return значение
     */
    public Task take() {
        return this.tasks.poll();
    }
}
