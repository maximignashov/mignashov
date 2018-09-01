package ru.job4j.extend.people;

/**
 * Class Facility.
 * @author mignashov
 * @since 20.04.2017
 * @version 1.0
 */
public class Patient {
    /**
     * Patients for Doctor.
     * @since 20.04.2017
     */
    private String fio; private int medicalCardsNumber;
    /**
     * Get private class field.
     * @return fio.
     */
    public String getFio() {
        return this.fio;
    }
    /**
     * Get private class field.
     * @return medicalCardsNumber.
     */
    public int getMedicalCardsNumber() {
        return this.medicalCardsNumber;
    }
}
