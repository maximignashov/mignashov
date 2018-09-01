package ru.job4j.tracker.start;

import java.util.ArrayList;

/**
 * Class ValidateInput.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 22.05.17
 */
public class ValidateInput extends ConsoleInput {
    /**
     * ask number.
     * @param question message for ru.job4j.user
     * @param range array menu numbers
     * @return int number
     */
    public int ask(String question, ArrayList<Integer> range) {
        boolean invalid = true;
        int value = 0;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key from menu. ");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again. ");
            }
        } while (invalid);
        return value;
    }
}
