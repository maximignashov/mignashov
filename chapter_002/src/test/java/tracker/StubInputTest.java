package tracker;

import tracker.models.Item;

import org.junit.Test;
import tracker.start.Input;
import tracker.start.StartUi;
import tracker.start.StubInput;
import tracker.start.Tracker;
import tracker.start.MenuOutException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

/**
 * Class StubInputTest.
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
        Input input = new StubInput(new String[]{"1", "test name", "desc", "7"});
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
                "1", "test name", "desc",
                "6", "test name", "7"});
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
                "5", id, "7"});
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
                "3", id, "new test", "new desc", "7"});
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
                "4", id, "7"});
        StartUi start = new StartUi(tracker, input);
        start.init();
        assertThat(tracker.findAll()[0], nullValue());
    }
    /**
     * Test wrong range menu.
     * @throws MenuOutException when out of menu range
     */
    @Test(expected = MenuOutException.class)
    public void whenTypeWrongMenuNumberThenThrowException() throws MenuOutException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"99"});
        new StartUi(tracker, input).init();
    }
    /**
     * Test string type.
     * @throws NumberFormatException when type string at menu
     */
    @Test(expected = NumberFormatException.class)
    public void whenTypeStringThenThrowException() throws NumberFormatException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"qwerty"});
        new StartUi(tracker, input).init();
    }

}