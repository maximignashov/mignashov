package extend.professions;

import extend.Profession;
import extend.people.Pupils;

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
     * Constructor.
     * @return subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     * Constructor.
     * @return form master
     */
    public boolean isFormMaster() {
        return this.formMaster;
    }
    /**
     * Constructor.
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }
    /**
     * Constructor.
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
        String learnerName;
        int learnerNumber;
        learnerName = pupils.getFio();
        learnerNumber = pupils.getStudyNumber();
    }
}
