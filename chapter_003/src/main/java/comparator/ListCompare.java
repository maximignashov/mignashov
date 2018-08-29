package comparator;

import java.util.Comparator;

/**
 * Class ListCompare.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 27.08.2018
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();

        int minLength = Math.min(leftLength, rightLength);

        int i = 0;
        while (i < minLength) {
            char leftChar = left.charAt(i);
            char rigthChar = right.charAt(i);
            if (leftChar != rigthChar) {
                return leftChar - rigthChar;
            }
            i++;
        }
        return leftLength - rightLength;
    }
}
