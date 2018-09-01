package ru.job4j.extend.professions;

import ru.job4j.extend.Profession;
import ru.job4j.extend.people.Pupils;

/**
 * Class Teacher.
 * @author mignashov
 * @since 20.04.2017
 * @version 1.0
 */
public class Teacher extends Profession {
    /**
     * Teacher class.
     * @since 20.04.2017
     */
    private String subject; private boolean formMaster; private String gender;
    /**
     * Constructor.
     * @param fio - surname name middle name.
     * @param subject - subject for pupils.
     * @param formMaster - form master: yes or no.
     * @param gender - gender: male or female.
     */
    public Teacher(String fio, String subject, boolean formMaster, String gender) {
        super(fio);
        this.subject = subject;
        this.formMaster = formMaster;
        this.gender = gender;
    }
    /**
     * Get field subject.
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }
    /**
     * Get field formMaster.
     * @return form master
     */
    public boolean isFormMaster() {
        return this.formMaster;
    }
    /**
     * Get field gender.
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Get field fio.
     * @return fio Teacher from class Profession
     */
    public String getFio() {
        return super.getFio();
    }
    /**
     * Treat Patient.
     * @param pupils - object of class Pupils.
     */
    public void teach(Pupils pupils) {
        //Teacher teach pupils
    }
}
