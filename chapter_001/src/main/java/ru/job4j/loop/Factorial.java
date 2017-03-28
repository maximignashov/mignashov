package ru.job4j.loop;

/**
* Factorial.
* @author mignashov
* @since 28.03.2017
* @version 1.0
*/
public class Factorial {
	/**
	* Counting factorial.
	* @param n  - number.
	* @return result counting.
	*/
	public int calc(int n) {
		int result = 1;
		if (n == 0) {
			return 1;
		} else {
			for (int index = 1; index <= n; index++) {
				result *= index;
			}
			return result;
		}
	}
}