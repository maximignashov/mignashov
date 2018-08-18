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
        }
        for (int i = 0; i < size; i++) {
            int min = task.getPriority();
            if (min < this.tasks.get(i).getPriority()) {
                this.tasks.add(i, task);
                size = 0;
            } else {
                for (int j = 0; j < size; j++) {
                    int max = task.getPriority();
                    if (this.tasks.get(j).getPriority() > max) {
                        this.tasks.add(j, task);
                        size = 0;
                    }
                }
            }
            if (size != 0) {
                size = 0;
                this.tasks.add(task);
            }
        }
    }
    /**
     * Метод выводит первый элемент из списка.
     * @return значение
     */
    public Task take() {
        return this.tasks.poll();
    }
}
