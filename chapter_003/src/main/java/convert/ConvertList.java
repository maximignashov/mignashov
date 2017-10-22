package convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Class ConvertList.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 17.09.17
 */
public class ConvertList {
    /**
     * Convert Array to List.
     * @param array array to convert
     * @return collection ArrayList
     */
    public List<Integer> toList(int[][] array) {
        ArrayList<Integer> listOfInteger = new ArrayList<>();

        for (int[] arr : array) {
            for (int i = 0; i < arr.length; i++) {
                listOfInteger.add(arr[i]);
            }
        }

        return listOfInteger;
    }
    /**
     * Convert List to Array.
     * @param list list to convert
     * @param rows number of rows
     * @return Array
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int[][] array = new int[rows][rows];

        int i = 0;
        int j = 0;
        for (Integer arrList: list) {
            for (; i < array.length;) {
                for (; j < array.length;) {
                    array[i][j] = arrList;
                    break;
                }
                j++;
                break;
            }
            if (j % rows == 0) {
                i++;
                j = 0;
            }
        }
        return array;
    }
}
