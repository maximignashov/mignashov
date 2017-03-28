package ru.job4j.max;

/**
* Класс, Max находит максимальное число.
* @author mignashov
* @since 24.03.2017
* @version 2.0
*/
public class Max {
	/**
	* Метод max находит максимальное из двух чисел.
	* @param first  - первое число.
	* @param second - второе число.
	* @return максимальное число примитивного типа int.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	* Метод max находит максимальное из трех чисел.
	* @param first  - первое число.
	* @param second - второе число.
	* @param third  - третье число.
	* @return максимальное число примитивного типа int.
	*/
	public int max(int first, int second, int third) {
		Max max = new Max();
		return max.max(first, max(second, third));
	}
}
