package tracker.start;

import java.util.Scanner;

/**
 * Package for class ConsoleInput.
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
}
