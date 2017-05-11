package tracker.start;

import tracker.models.Item;

import java.util.Random;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.04.17
 */
public class Tracker {
    /**
     * Item[] array.
     */
    private Item[] items = new Item[100];
    /**
     * position.
     */
    private int position = 0;
    /**
     * random.
     */
    private static final Random RN = new Random();
    /**
     * add item.
     * @param item item for add
     * @return item
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    /**
     * update item.
     * @param item item for update
     */
    public void update(Item item) {
        for (int index = 0; index != this.items.length; index++) {
            String id = this.items[index].getId();
            Item fItem = findById(id);
            if (fItem != null && item.getId().equals(id)) {
                this.items[index] = item;
                break;
            }
        }
    }
    /**
     * delete item.
     * @param item item for delete
     */
    public void delete(Item item) {
        for (int index = 0; index != this.items.length; index++) {
            String id = this.items[index].getId();
            Item fItem = findById(id);
            if (fItem != null && item.getId().equals(id)) {
                this.items[index] = null;
                break;
            }
        }
    }
    /**
     * find all items.
     * @return find items
     */
    public Item[] findAll() {
        Item[] result  = new Item[items.length];
        for (int index = 0; index != this.items.length; index++) {
            if (items[index] != null) {
                result[index] = items[index];
            }
        }
        return result;
    }
    /**
     * find item by name.
     * @param key item name
     * @return find one item
     */
    public Item[] findByName(String key) {
        Item[] result  = new Item[items.length];
        for (int index = 0; index != this.items.length; index++) {
            if (items[index] != null && items[index].getName().equals(key)) {
                result[index] = items[index];
            }
        }
        return result;
    }
    /**
     * find item by id.
     * @param id item id
     * @return find item
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * generate item id.
     * @return id
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

}
