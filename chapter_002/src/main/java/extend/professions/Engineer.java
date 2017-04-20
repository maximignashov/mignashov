package extend.professions;

import extend.Profession;
import extend.people.Facility;

/**
 * Class Engineer.
 * @author mignashov
 * @since 20.04.2017
 * @version 1.0
 */
public class Engineer extends Profession {
    /**
     * Engineer class.
     * @since 20.04.2017
     */
    private String post; private int office;
    /**
     * Constructor.
     * @param fio - surname name middle name.
     * @param post - engineer post.
     * @param office - office number.
     */
    public Engineer(String fio, String post, int office) {
        super(fio);
        this.post = post;
        this.office = office;
    }
    /**
     * Constructor.
     * @return post
     */
    public String getPost() {
        return this.post;
    }
    /**
     * Constructor.
     * @return office
     */
    public int getOffice() {
        return this.office;
    }
    /**
     * Constructor.
     * @return fio Engineer from class Profession
     */
    public String getFio() {
        return super.getFio();
    }
    /**
     * Design facility.
     * @param facility - object of class Facility.
     */
    public void design(Facility facility) {
        int numberFacility;
        numberFacility = facility.getNumber();
    }
}
