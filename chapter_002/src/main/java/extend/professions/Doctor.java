package extend.professions;

import extend.Profession;
import extend.people.Patient;

/**
 * Class Doctor.
 * @author mignashov
 * @since 20.04.2017
 * @version 1.0
 */
public class Doctor extends Profession {
    /**
     * Doctor class.
     * @since 20.04.2017
     */
    private String specialisation; private String receptionHours;
    /**
     * Constructor.
     * @param fio - surname name middle name.
     * @param receptionHours - reception hours.
     * @param specialisation - specialisation.
     */
    public Doctor(String fio, String specialisation, String receptionHours) {
        super(fio);
        this.specialisation = specialisation;
        this.receptionHours = receptionHours;
    }
    /**
     * Constructor.
     * @return fio Doctor from class Profession
     */
    public String getFio() {
        return super.getFio();
    }
    /**
     * Constructor.
     * @return specialisation
     */
    public String getSpecialisation() {
        return this.specialisation;
    }
    /**
     * Constructor.
     * @return receptionHours
     */
    public String getReceptionHours() {
        return this.receptionHours;
    }
    /**
     * Treat Patient.
     * @param patient - object of class Patient.
     */
    public void treat(Patient patient) {
        String patientFIO;
        int patienMedicalCardsNumber;

        patientFIO = patient.getFio();
        patienMedicalCardsNumber = patient.getMedicalCardsNumber();
    }
}
