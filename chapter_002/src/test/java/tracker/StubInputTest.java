package tracker;

import tracker.models.Item;
import tracker.start.Input;
import tracker.start.StubInput;
import tracker.start.Tracker;
import tracker.start.StartUi;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Class StupInputTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 10.05.17
 */
public class StubInputTest {
    /**
     * Test add item and find all.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUi(tracker, input).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test find by name.
     */
    @Test
    public void whenUserAddNewItemAndUserFindItemByNameThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{
                "0", "test name", "desc",
                "5", "test name", "6"});
        new StartUi(tracker, input).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test find by id.
     */
    @Test
    public void whenAddNewItemAndUserFindItemByIdThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1")[0].getId();
        Input input = new StubInput(new String[]{
                "4", id, "6"});
        new StartUi(tracker, input).init();
        assertThat(tracker.findAll()[0].getName(), is("test1"));
    }
    /**
     * Test update item.
     */
    @Test
    public void whenAddNewItemAndUserUpdateItemThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1")[0].getId();
        Input input = new StubInput(new String[]{
                "2", id, "new test", "new desc", "6"});
        StartUi start = new StartUi(tracker, input);
        start.init();
        assertThat(tracker.findAll()[0].getName(), is("new test"));
    }
    /**
     * Test delete item.
     */
    @Test
    public void whenAddNewItemThenTrackerDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1")[0].getId();
        Input input = new StubInput(new String[]{
                "3", id, "6"});
        StartUi start = new StartUi(tracker, input);
        start.init();
        assertThat(tracker.findAll()[0], nullValue());
    }
}
