package ru.job4j.condition;

/**
* Класс, Point описывает точку в системе координат.
* @author mignashov
* @since 25.03.2017
* @version 1
*/
public class Point {
	/**
	* Объявление переменной x типа int.
	*/
    private int x;
    /**
	* Объявление переменной y типа int.
	*/
    private int y;
    /**
	* Метод Point задает значение переменным класса.
	* @param x - ось абсцисс.
	* @param y - ось ординат.
	*/
    public Point(int x, int y) {
    	this.x = x;
        this.y = y;
    }
    /**
	* Метод getX получает значение первого поля.
	* @return значение первого поля примитивного типа int.
	*/
    public int getX() {
        return this.x;
    }
    /**
	* Метод getY получает значение второго поля.
	* @return значение второго поля примитивного типа int.
	*/
    public int getY() {
        return this.y;
    }
    /**
	* Метод is определяет нахождение точки на графике функции.
	* @param a - координаты точки.
	* @param b - координаты точки.
	* @return true or false.
	*/
    public boolean is(int a, int b) {
    return this.y == a * this.x + b;
	}
}
