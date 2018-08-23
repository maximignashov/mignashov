package tracker.start;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class ConsoleInput.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 06.05.17
 */
public class ConsoleInput implements Input {
    /**
     * Scanner for input.
     */
    private Scanner scanner = new Scanner(System.in);
    /**
     * initialisation.
     * @param question question for ask
     * @return String answer for question
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
    /**
     * initialisation.
     * @param question question for ask
     * @param range number of menu
     * @return number menu
     * @throws MenuOutException RuntimeException
     */
    public int ask(String question, ArrayList<Integer> range) throws MenuOutException {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of range");
        }
    }
}
