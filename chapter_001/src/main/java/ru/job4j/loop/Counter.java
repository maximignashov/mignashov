package ru.job4j.loop;

/**
* Counter.
* @author mignashov
* @since 28.03.2017
* @version 1.0
*/
public class Counter {
	/**
	* Counting even range.
	* @param start  - start range.
	* @param finish - end range.
	* @return result counting.
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int index = start; index <= finish; index++) {
			result += index % 2 == 0 ? index : 0;
		}
		return result;
	}
}