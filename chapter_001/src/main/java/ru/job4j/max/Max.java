package ru.job4j.max;

/**
* Класс, Max, включает метод, который находит максимальное число из двух.
* @author mignashov
* @since 24.03.2017
* @version 1
*/
public class Max {
	/**
	* Метод max находит максимальное из двух чисел.
	* @param first  - первое число.
	* @param second - второе число.
	* @return максимально число примитивного типа int.
	*/
	public int max(int first, int second) {
		int first > second ? first : second;
	}
}
