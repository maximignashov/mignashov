package ru.job4j.user;

/**
 * Class User.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 18.08.2018
 */
public class User {
    /**
     * Переменные класса.
     */
    private int id; private String name; private String city;
    /**
     * Конструктор.
     * @param curId - идентификатор.
     * @param curName - имя.
     * @param curCity - город.
     */
    public User(final int curId, final String curName, final String curCity) {
        this.id = curId;
        this.name = curName;
        this.city  = curCity;
    }
    /**
     * Геттер для id.
     * @return id.
     */
    public final int getId() {
        return id;
    }
}
