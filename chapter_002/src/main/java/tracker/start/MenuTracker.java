package tracker.start;

import tracker.models.Item;
import tracker.models.Task;

/**
 * External class EditItem.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
class EditItem implements UserAction {
    /**
     * key for select.
     * @return int number for edit item
     */
    public int key() {
        return 3;
    }
    /**
     * menu.
     * @return String menu
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item");
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    public void execute(Input input, Tracker tracker) {
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
}
/**
 * External class DeleteItem.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
class DeleteItem implements UserAction {
    /**
     * key for select.
     * @return int number menu for delete item
     */
    public int key() {
        return 4;
    }
    /**
     * menu.
     * @return String menu
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Delete item");
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("item id for delete: ");
        Item item = tracker.findById(id);
        if (item != null) {
            tracker.delete(item);
            System.out.println("Success delete!");
        } else {
            System.out.println("can't find any items with id: " + id + ", please try again.");
        }
    }
}
/**
 * External class ExitTracker.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
class ExitTracker implements UserAction {
    /**
     * key for select.
     * @return int number to exit programm
     */
    public int key() {
        return 7;
    }
    /**
     * menu.
     * @return String menu
     */
    public String info() {
        return String.format("%s. %s", this.key(), "Exit programm");
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    public void execute(Input input, Tracker tracker) {
        System.out.println("Exiting...");
    }
}
/**
 * Main class MenuTracker.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
public class MenuTracker {
    /**
     * Tracker object.
     */
    private Tracker tracker;
    /**
     * Input object.
     */
    private Input input;
    /**
     * array with actions.
     */
    private UserAction[] actions = new UserAction[8];
    /**
     * Constructor.
     * @param tracker initialisation
     * @param input initialisation
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Fill menu and determine action.
     */
    public void fillActions() {
        this.actions[1] = this.new AddItem();
        this.actions[2] = new MenuTracker.ShowAllItems();
        this.actions[3] = new EditItem();
        this.actions[4] = new DeleteItem();
        this.actions[5] = new MenuTracker.FindItemById();
        this.actions[6] = this.new FindItemByName();
        this.actions[7] = new ExitTracker();
    }
    /**
     * Select action.
     * @param key int number of menu
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * Show all actions menu.
     */
    public void show() {
        for (UserAction action : actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Internal class AddItem.
     * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
     * @version 1.0
     * @since 15.05.17
     */
    private class AddItem implements UserAction {
        /**
         * key for select.
         * @return int number to add item
         */
        public int key() {
            return 1;
        }
        /**
         * menu.
         * @return String menu
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("item user name: ");
            String description = input.ask("item description: ");
            tracker.add(new Task(name, description));
        }
    }
    /**
     * Internal static class ShowAllItems.
     * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
     * @version 1.0
     * @since 15.05.17
     */
    private static class ShowAllItems implements UserAction {
        /**
         * key for select.
         * @return int number to show all items
         */
        public int key() {
            return 2;
        }
        /**
         * menu.
         * @return String menu
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        public void execute(Input input, Tracker tracker) {
            for (Item items : tracker.findAll()) {
                if (items != null) {
                    System.out.println("name: " + items.getName() + ", ");
                    System.out.print(" description: " + items.getDescription() + ", ");
                    System.out.println(" id: " + items.getId());
                }
            }
        }
    }
    /**
     * Internal static class FindById.
     * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
     * @version 1.0
     * @since 15.05.17
     */
    private static class FindItemById implements UserAction {
        /**
         * key for select.
         * @return int number to find item by id
         */
        public int key() {
            return 5;
        }
        /**
         * menu.
         * @return String menu
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by id");
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        public void execute(Input input, Tracker tracker) {
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
    }
    /**
     * Internal class FindByName.
     * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
     * @version 1.0
     * @since 15.05.17
     */
    private class FindItemByName implements UserAction {
        /**
         * key for select.
         * @return int number to find item by name
         */
        public int key() {
            return 6;
        }
        /**
         * menu.
         * @return String menu
         */
        public String info() {
            return String.format("%s. %s", this.key(), "Find items by name");
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        public void execute(Input input, Tracker tracker) {
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
    }
}
