package tracker;

import tracker.models.Item;

import org.junit.Test;
import tracker.start.Input;
import tracker.start.StartUi;
import tracker.start.StubInput;
import tracker.start.Tracker;
import tracker.start.MenuOutException;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
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
        Input input = new StubInput(new ArrayList<String>() {{
            add("1");
            add("test name");
            add("desc");
            add("7");
        }});

            new StartUi(tracker, input).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }
    /**
     * Test find by name.
     */
    @Test
    public void whenUserAddNewItemAndUserFindItemByNameThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new ArrayList<String>() {{
            add("1");
            add("test name");
            add("desc");
            add("6");
            add("test name");
            add("7");
        }});
        new StartUi(tracker, input).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }
    /**
     * Test find by id.
     */
    @Test
    public void whenAddNewItemAndUserFindItemByIdThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1").get(0).getId();
        Input input = new StubInput(new ArrayList<String>() {{
            add("5");
            add(id);
            add("7");
        }});
        new StartUi(tracker, input).init();
        assertThat(tracker.findAll().get(0).getName(), is("test1"));
    }
    /**
     * Test update item.
     */
    @Test
    public void whenAddNewItemAndUserUpdateItemThenTrackerHasFindItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1").get(0).getId();
        Input input = new StubInput(new ArrayList<String>() {{
            add("3");
            add(id);
            add("new test");
            add("new desc");
            add("7");
        }});
        StartUi start = new StartUi(tracker, input);
        start.init();
        assertThat(tracker.findAll().get(0).getName(), is("new test"));
    }
    /**
     * Test delete item.
     */
    @Test
    public void whenAddNewItemThenTrackerDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        String id = tracker.findByName("test1").get(0).getId();
        Input input = new StubInput(new ArrayList<String>() {{
            add("4");
            add(id);
            add("7");
        }});
        StartUi start = new StartUi(tracker, input);
        start.init();
        assertThat(tracker.findAll().size(), is(0));
    }
    /**
     * Test wrong range menu.
     * @throws MenuOutException when out of menu range
     */
    @Test(expected = MenuOutException.class)
    public void whenTypeWrongMenuNumberThenThrowException() throws MenuOutException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new ArrayList<String>() {{
            add("99");
        }});
        new StartUi(tracker, input).init();
    }
    /**
     * Test string type.
     * @throws NumberFormatException when type string at menu
     */
    @Test(expected = NumberFormatException.class)
    public void whenTypeStringThenThrowException() throws NumberFormatException {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new ArrayList<String>() {{
            add("qwerty");
        }});
        new StartUi(tracker, input).init();
    }
}