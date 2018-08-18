package user;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 18.08.2018
 */
public class User {
    private int id;
    private String name;
    private String city;

    /**
     * Конструктор.
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city  = city;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}
