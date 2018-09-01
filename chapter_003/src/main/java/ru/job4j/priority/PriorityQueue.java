package ru.job4j.priority;

import java.util.LinkedList;

/**
 * Package for class PriorityQueue.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 12.07.2018
 */
public class PriorityQueue {
    /**
     * Создание tasks.
     */
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод вставляет в нужную позицию элемент.
     * @param task задача
     */
    public final void put(final Task task) {
        int size = this.tasks.size();
        int index = size;
        int currentPriority = task.getPriority();
        for (int i = 0; i < size; i++) {
            if (currentPriority < this.tasks.get(i).getPriority()) {
                index = i;
                size = 0;
            }
        }
        tasks.add(index, task);
    }
    /**
     * Метод выводит первый элемент из списка.
     * @return Task - значение
     */
    public final Task take() {
        return this.tasks.poll();
    }
}
