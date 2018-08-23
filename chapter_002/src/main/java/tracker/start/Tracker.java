package tracker.start;

import tracker.models.Item;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Class Tracker.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 24.04.17
 */
public class Tracker {
    /**
     * ArrayList.
     */
    private List<Item> items = new ArrayList<>();
//    private Item[] items = new Item[100];
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
        this.items.add(position++, item);
        return item;
    }
    /**
     * update item.
     * @param item item for update
     */
    public void update(Item item) {
        for (int index = 0; index != this.items.size(); index++) {
            String id = this.items.get(index).getId();
            Item fItem = findById(id);
            if (fItem != null && item.getId().equals(id)) {
                this.items.add(index, item);
                break;
            }
        }
    }
    /**
     * delete item.
     * @param item item for delete
     */
    public void delete(Item item) {
        for (int index = 0; index != this.items.size(); index++) {
            String id = this.items.get(index).getId();
            //Item fItem = findById(id);
            if (item.getId() != null && item.getId().equals(id)) {
                this.items.remove(item);
                break;
            }
        }
    }
    /**
     * find all items.
     * @return find items
     */
    public List<Item> findAll() {
        ArrayList<Item> result  = new ArrayList<>();
        for (int index = 0; index != this.items.size(); index++) {
            if (items.get(index) != null) {
                result.add(index, items.get(index));
            }
        }
        return result;
    }
    /**
     * find item by name.
     * @param key item name
     * @return find one item
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result  = new ArrayList<>();
        for (int index = 0; index != this.items.size(); index++) {
            if (items.get(index) != null && items.get(index).getName().equals(key)) {
                result.add(index, items.get(index));
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
