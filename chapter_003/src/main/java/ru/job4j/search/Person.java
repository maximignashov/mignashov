package ru.job4j.search;

/**
 * Class Person.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 07.07.2018
 */
public class Person {
    /**
     * Переменные name, surname класса Person.
     */
    private String name; private String surname;
    /**
     * Переменные phone, surname класса address.
     */
    private String phone; private String address;
    /**
     * Конструктор.
     * @param curName Person name
     * @param curSurname Person surname
     * @param curPhone Person phone
     * @param curAddress Person address
     */
    public Person(final String curName,  final String curSurname,
                  final String curPhone, final String curAddress) {
        this.name = curName;
        this.surname = curSurname;
        this.phone = curPhone;
        this.address = curAddress;
    }
    /**
     * Get name of Person.
     * @return name
     */
    public final String getName() {
        return name;
    }
    /**
     * Get surname of Person.
     * @return surname
     */
    public final String getSurname() {
        return surname;
    }
    /**
     * Get phone of Person.
     * @return phone
     */
    public final String getPhone() {
        return phone;
    }
    /**
     * Get address of Person.
     * @return address
     */
    public final String getAddress() {
        return address;
    }
}
