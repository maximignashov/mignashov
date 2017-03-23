package ru.job4j.calculator;

/**
* Class Класс выполняет операции над двумя чилами (сложение, вычитание, деление, умножение).
* @author mignashov
* @since 20.03.2017
* @version 1
*/
public class Calculator {
	/**
	* Объявление переменной result типа double.
	*/
	private double result;
	/**
	* Метод, сложение первого и второго аргумента.
	* @param first  - первый аргумент.
	* @param second - второй аргумент.
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	* Метод, вычитание первого и второго аргумента.
	* @param first  - первый аргумент.
	* @param second - второй аргумент.
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}
	/**
	* Метод, деление первого и второго аргумента.
	* @param first  - первый аргумент.
	* @param second - второй аргумент.
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}
	/**
	* Метод, умножение первого и второго аргумента.
	* @param first  - первый аргумент.
	* @param second - второй аргумент.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	* Метод, возвращает результат.
	* @return result - возвращает результат.
	*/
	public double getResult() {
		return this.result;
	}

}