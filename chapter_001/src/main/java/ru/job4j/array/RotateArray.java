package ru.job4j.array;

/**
* Rotate array cloclwise.
* @author mignashov
* @since 01.04.2017
* @version 1.0
*/
public class RotateArray {
	/**
	* Rotate array clockwise.
	* @param array  - array for rotate.
	* @return rotated array.
	*/
	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length / 2; i++) {
        	for (int j = 0; j < array.length - 1 - i; j++) {
        		int temp = array[i][j];
        		array[i][j] = array[array.length - 1 - j][i];
        		array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j];
        		array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i];
        		array[j][array.length - 1 - i] = temp;
			}
		}
	return array;
	}
}