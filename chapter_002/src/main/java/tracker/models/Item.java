package tracker.models;

/**
 * Class Item.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 21.04.17
 */
public class Item {
    /**
     * Item name.
     */
    private String name;
    /**
     * Item description.
     */
    private String description;
    /**
     * Item create date.
     */
    private long create;
    /**
     * Item id.
     */
    private String id;
    /**
     * Constructor default.
     */
    public Item() {
    }
    /**
     * Constructor.
     * @param create item create date
     * @param description item description
     * @param name item name
     */
    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }
    /**
     * Set name.
     * @param name item name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Set description.
     * @param description item description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Set create.
     * @param create item create date
     */
    public void setCreate(long create) {
        this.create = create;
    }
    /**
     * Set id.
     * @param id items id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Get name.
     * @return name.
     */
    public String getName() {
        return this.name;
    }
    /**
     * Get description.
     * @return description.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Get create.
     * @return create.
     */
    public long getCreate() {
        return this.create;
    }
    /**
     * Get id.
     * @return id.
     */
    public String getId() {
        return this.id;
    }
}
