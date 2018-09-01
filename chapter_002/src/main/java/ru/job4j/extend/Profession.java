package ru.job4j.extend;

/**
 * Class Profession.
 * @author mignashov
 * @since 20.04.2017
 * @version 1.0
 */
public class Profession {
    /**
     * Profession class for Doctor, Engineer, Pupils.
     * @since 20.04.2017
     */
    private String fio;
    /**
     * Constructor default.
     */
    public Profession() {
    }
    /**
     * Constructor.
     * @param fio - surname name middle name.
     */
    public Profession(String fio) {
        this.fio = fio;
    }
    /**
     * Get field.
     * @return fio.
     */
    public String getFio() {
        return this.fio;
    }
}
