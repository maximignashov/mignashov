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
     * Get field post.
     * @return post
     */
    public String getPost() {
        return this.post;
    }
    /**
     * Get field office.
     * @return office
     */
    public int getOffice() {
        return this.office;
    }
    /**
     * Get field fio.
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
        //Engineer design facility
    }
}
