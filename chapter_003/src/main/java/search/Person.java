package search;

/**
 * Class Person.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 07.07.2018
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;
    /**
     * Конструктор.
     * @param name Person name
     * @param surname Person surname
     * @param phone Person phone
     * @param address Person address
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }
    /**
     * Get name of Person
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Get surname of Person
     * @return surname
     */
    public String getSurname() {
        return surname;
    }
    /**
     * Get phone of Person
     * @return phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Get address of Person
     * @return address
     */
    public String getAddress() {
        return address;
    }
}
