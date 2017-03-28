package ru.job4j.condition;
/**
* Класс, Point описывает точку в системе координат.
* @author mignashov
* @since 27.03.2017
* @version 2
*/
public class Triangle {
	/**
	* Объявление переменной a типа Point.
	*/
	private Point a;
	/**
	* Объявление переменной b типа Point.
	*/
	private Point b;
	/**
	* Объявление переменной c типа Point.
	*/
	private Point c;
	/**
	* Конструктор. Задает стороны треугольника.
	* @param a pointA.
	* @param b pointB.
	* @param c pointC.
	*/
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	* Рассчет площади треугольника.
	* @return -1 если треугольник не существует.
	*/
	public double area() {
		double spacingAB = a.spacingTo(b);
		double spacingBC = b.spacingTo(c);
		double spacingAC = a.spacingTo(c);

		boolean isTriangle = ((spacingAB + spacingBC > spacingAC) & (spacingBC + spacingAC > spacingAB) & (spacingAB + spacingAC > spacingBC));
		if (isTriangle) {
			double p = (spacingAB + spacingBC + spacingAC) / 2;
			return Math.sqrt(p * (p - spacingAB) * (p - spacingBC) * (p - spacingAC));
		} else {
			return -1;
		}
	}
}

