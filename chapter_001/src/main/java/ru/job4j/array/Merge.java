package ru.job4j.array;

/**
* Merge two arrays.
* @author mignashov
* @since 13.04.2017
* @version 1.0
*/
public class Merge {
	/**
	* Merge two arrays to one.
	* @param arrayOne  - array one.
	* @param arrayTwo  - array two.
	* @return merged array.
	*/
	public int[] merge(int[] arrayOne, int[] arrayTwo) {
    	int[] arrayMerge = new int[arrayOne.length + arrayTwo.length];
    	int i = 0, j = 0;
    	for (int k = 0; k < arrayMerge.length; k++) {
        	if (i > arrayOne.length - 1) {
            	int a = arrayTwo[j];
            	arrayMerge[k] = a;
            	j++;
        	} else if (j > arrayTwo.length - 1) {
            	int a = arrayOne[i];
            	arrayMerge[k] = a;
            	i++;
        	} else if (arrayOne[i] < arrayTwo[j]) {
            	int a = arrayOne[i];
            	arrayMerge[k] = a;
            	i++;
        	} else {
            	int b = arrayTwo[j];
            	arrayMerge[k] = b;
            	j++;
        	}
		}
	return arrayMerge;
	}
}