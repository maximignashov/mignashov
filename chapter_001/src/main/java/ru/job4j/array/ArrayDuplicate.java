package ru.job4j.array;

import java.util.Arrays;

/**
* Deleted duplicates in array.
* @author mignashov
* @since 01.04.2017
* @version 1.0
*/
public class ArrayDuplicate {
	/**
	* Deleted array duplicates.
	* @param array  - array for delete duplicates.
	* @return array without duplicates.
	*/
	public String[] remove(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1 - count; i++) {
			for (int j = i + 1; j < array.length - 1 - count; j++) {
				if (array[i].equals(array[j])) {
					String temp = array[j];
					array[j] = array[array.length - 1 - count];
					array[array.length - 1 - count] = temp;
					count++;
				}
			}
		}
	return Arrays.copyOf(array, array.length - count);
	}
}