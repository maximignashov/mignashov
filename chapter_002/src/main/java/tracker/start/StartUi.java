package tracker.start;

import tracker.models.Item;
import tracker.models.Task;

/**
 * Package for class StartUi.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 06.05.17
 */
public class StartUi {
    /**
     * Tracker object.
     */
    private Tracker tracker;
    /**
     * ConsoleInput object.
     */
    private ConsoleInput input;
    /**
     * Constructor.
     */
    public StartUi() {
        this.tracker = new Tracker();
        this.input = new ConsoleInput();
    }
    /**
     * initialisation.
     */
    public void init() {
        String choice;
        String[] menu = new String[] {
            "0. Add new Item",
                    "1. Show all items",
                    "2. Edit item",
                    "3. Delete item",
                    "4. Find item by Id",
                    "5. Find items by name",
                    "6. Exit Program"
        };
        do {
            for (String menuItems : menu) {
                System.out.println(menuItems);
            }
            choice = input.ask("Select number: ");
            doSomething(choice);
        } while (!choice.equals("6"));

    }
    /**
     * add item.
     */
    public void addItem() {
        String name = input.ask("item user name: ");
        String description = input.ask("item description: ");
        tracker.add(new Task(name, description));
    }
    /**
     * show items.
     */
    public void showItems() {
        for (Item items : tracker.findAll()) {
            if (items != null) {
                System.out.print("name: " + items.getName() + ", ");
                System.out.print(" description: " + items.getDescription() + ", ");
                System.out.println(" id: " + items.getId());
            }
        }
    }
    /**
     * edit item.
     */
    public void editItem() {
        String id = input.ask("item id for edit: ");
        Item item = tracker.findById(id);
        if (item != null) {
            String name = input.ask("new name: ");
            String description = input.ask("new description: ");
            item.setName(name);
            item.setDescription(description);
            tracker.update(item);
            System.out.println("Success edit!");
        } else {
            System.out.println("can't find any items with id: " + id + ", please try again.");
        }
    }
    /**
     * delete item.
     */
    public void deleteItem() {
        String id = input.ask("item id for delete: ");
        Item item = tracker.findById(id);
        if (item != null) {
            tracker.delete(item);
            System.out.println("Success delete!");
        } else {
            System.out.println("can't find any items with id: " + id + ", please try again.");
        }
    }
    /**
     * find item by id.
     */
    public void findItemById() {
        String id = input.ask("item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.print("name: " + item.getName() + ", ");
            System.out.print(" description: " + item.getDescription() + ", ");
            System.out.println(" id: " + item.getId());
        } else {
            System.out.println("can't find any items with id: " + id + ", please try again.");
        }
    }
    /**
     * find item by name.
     */
    public void findItemByName() {
        String name = input.ask("item name: ");
        Item[] item = tracker.findByName(name);
        int count = 0;
        for (int index = 0; index != item.length; index++) {
            if (item[index] != null) {
                System.out.print("name: " + item[index].getName() + ", ");
                System.out.print(" description: " + item[index].getDescription() + ", ");
                System.out.println(" id: " + item[index].getId());
            } else {
                count++;
            }
            if (count == item.length) {
                System.out.println("can't find any items with name: " + name + ", please try again.");
            }
        }
    }
    /**
     * interface menu.
     * @param choice number menu
     */
    private void doSomething(String choice) {
        if (choice.equals("0")) {
            addItem();
        } else if (choice.equals("1")) {
            showItems();
        } else if (choice.equals("2")) {
            editItem();
        } else if (choice.equals("3")) {
            deleteItem();
        } else if (choice.equals("4")) {
            findItemById();
        } else if (choice.equals("5")) {
            findItemByName();
        } else if (choice.equals("6")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Please type number item menu.");
        }
    }
}
