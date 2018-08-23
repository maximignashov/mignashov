package tracker.start;

import tracker.models.Item;
import tracker.models.Task;

import java.util.ArrayList;

/**
 * External class EditItem.
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 15.05.17
 */
class EditItem extends BaseAction {
    /**
     * Constructor.
     * @param name action menu name
     * @param key key menu action
     */
    EditItem(String name, int key) {
        super(name, key);
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    @Override
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
class DeleteItem extends BaseAction {
    /**
     * Constructor.
     * @param name action menu name
     * @param key key menu action
     */
    DeleteItem(String name, int key) {
        super(name, key);
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    @Override
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
class ExitTracker extends BaseAction {
    /**
     * Constructor.
     * @param name action menu name
     * @param key key menu action
     */
    ExitTracker(String name, int key) {
        super(name, key);
    }
    /**
     * execute action of menu.
     * @param input interface for ask
     * @param tracker object for action with
     */
    @Override
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
    private ArrayList<UserAction> actions = new ArrayList<>();
    /**
     * array range.
     */
    private ArrayList<Integer> ranges = new ArrayList<>();
    /**
     * position menu number.
     */
    private int position = 1;
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
        this.actions.add(this.new AddItem("Add new item", position++));
        this.actions.add(new MenuTracker.ShowAllItems("Show all items", position++));
        this.actions.add(new EditItem("Edit item", position++));
        this.actions.add(new DeleteItem("Delete item", position++));
        this.actions.add(new MenuTracker.FindItemById("Find item by id", position++));
        this.actions.add(this.new FindItemByName("Find items by name", position++));
        this.actions.add(new ExitTracker("Exit programm", position++));
    }
    /**
     * Fill values range.
     */
    public void fillRange() {
        if (this.ranges.size() == 0) {
            for (int index = 0; index != this.actions.size(); index++) {
                this.ranges.add(index, index + 1);
            }
        }
    }
    /**
     * Get values range.
     * @return int array
     */
    public ArrayList<Integer> getRanges() {
        return this.ranges;
    }
    /**
     * Select action.
     * @param key int number of menu
     */
    public void select(int key) {
        this.actions.get(key-1).execute(this.input, this.tracker);
    }
    /**
     * Show all actions menu.
     */
    public void show() {
        fillRange();
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
    private class AddItem extends BaseAction {
        /**
         * Constructor.
         * @param name action menu name
         * @param key key menu action
         */
        AddItem(String name, int key) {
            super(name, key);
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        @Override
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
    private static class ShowAllItems extends BaseAction {
        /**
         * Constructor.
         * @param name action menu name
         * @param key key menu action
         */
        ShowAllItems(String name, int key) {
            super(name, key);
        }
         /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item items : tracker.findAll()) {
                if (items != null) {
                    System.out.println("name: " + items.getName() + ", ");
                    System.out.println("description: " + items.getDescription() + ", ");
                    System.out.println("id: " + items.getId());
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
    private static class FindItemById extends BaseAction {
        /**
         * Constructor.
         * @param name action menu name
         * @param key key menu action
         */
        FindItemById(String name, int key) {
            super(name, key);
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("item id: ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println("name: " + item.getName() + ", ");
                System.out.println("description: " + item.getDescription() + ", ");
                System.out.println("id: " + item.getId());
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
    private class FindItemByName extends BaseAction {
        /**
         * Constructor.
         * @param name action menu name
         * @param key key menu action
         */
        FindItemByName(String name, int key) {
            super(name, key);
        }
        /**
         * execute action of menu.
         * @param input interface for ask
         * @param tracker object for action with
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("item name: ");
            ArrayList<Item> item = tracker.findByName(name);
            int count = 0;
            for (int index = 0; index != item.size(); index++) {
                if (item.get(index) != null) {
                    System.out.println("name: " + item.get(index).getName() + ", ");
                    System.out.println("description: " + item.get(index).getDescription() + ", ");
                    System.out.println("id: " + item.get(index).getId());
                } else {
                    count++;
                }
                if (count == item.size()) {
                    System.out.println("can't find any items with name: " + name + ", please try again.");
                }
            }
        }
    }
}
