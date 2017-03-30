package ru.job4j.array;

/**
* Turn.
* @author mignashov
* @since 29.03.2017
* @version 1.0
*/
public class Turn {
	/**
	* Turn array.
	* @param array  - array for turn.
	* @return turning array.
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
	return array;
	}
}