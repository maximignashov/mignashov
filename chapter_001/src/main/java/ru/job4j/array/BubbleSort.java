package ru.job4j.array;

/**
* Sort array bubble.
* @author mignashov
* @since 30.03.2017
* @version 1.0
*/
public class BubbleSort {
	/**
	* Bubble sort array.
	* @param array  - array for turn.
	* @return turning array.
	*/
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
        	for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	return array;
	}
}