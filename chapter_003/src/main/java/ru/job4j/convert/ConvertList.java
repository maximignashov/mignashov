package ru.job4j.convert;

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
    public final List<Integer> toList(final int[][] array) {
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
     * @param list list to ru.job4j.convert
     * @param rows number of rows
     * @return Array
     */
    public final int[][] toArray(final List<Integer> list, final int rows) {
        int[][] array = new int[rows][rows];

        int i = 0;
        int j = 0;
        for (Integer arrList: list) {
            if (list.get(arrList - 1) != null) {
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
        }
        return array;
    }
    /**
     * Convert two List<int[]> to one List<Integer>.
     * @param list list to ru.job4j.convert
     * @return List<Integer>
     */
    public final List<Integer> convert(final List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] arr : list) {
            for (int elem : arr) {
                result.add(elem);
            }
        }
        return result;
    }
}
