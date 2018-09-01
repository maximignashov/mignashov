package ru.job4j.sort;

/**
 * Class User.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.08.2018
 */
public class User implements Comparable<User> {
    /**
     * Переменные класса.
     */
    private int age; private String name;
    /**
     * Конструктор класса User.
     * @param curAge  - возраст.
     * @param curName - имя.
     */
    public User(final int curAge, final String curName) {
        this.age = curAge;
        this.name = curName;
    }
    /**
     * Геттер для age.
     * @return age.
     */
    public final int getAge() {
        return age;
    }
    /**
     * Геттер для name.
     * @return name.
     */
    public final String getName() {
        return name;
    }
    /**
     * Переопределение метода compareTo.
     * @param o - объект сравнения.
     * @return int.
     */
    @Override
    public final int compareTo(final User o) {
        return Integer.compare(age, o.age);
    }
}
