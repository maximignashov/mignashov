package ru.job4j.tracker.start;

import java.util.ArrayList;

/**
 * Interface Input.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 06.05.17
 */
public interface Input {
    /**
     * ask initialisation.
     * @param question question for ask
     * @return String answer the question
     */
    String ask(String question);
    /**
     * ask int initialisation.
     * @param question question for ask
     * @param range ArrayList
     * @return String answer the question
     */
    int ask(String question, ArrayList<Integer> range);
}
