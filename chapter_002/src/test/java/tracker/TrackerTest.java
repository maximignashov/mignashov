package tracker;

import tracker.models.Item;
import tracker.start.Tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class TrackerTest.
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 05.05.17
 */
public class TrackerTest {
    /**
     * Test findAll.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll().get(0), is(item));
    }
    /**
     * Test findByName.
     */
    @Test
    public void whenAddNewItemThenTrackerFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findByName("test1").get(0), is(item));
    }
    /**
     * Test update.
     */
    @Test
    public void whenAddNewItemThenUpdateItemAndFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        item.setDescription("newDescription");
        tracker.update(item);
        assertThat(tracker.findByName("test1").get(0), is(item));
    }
    /**
     * Test delete.
     */
    @Test
    public void whenAddNewItemThenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        tracker.delete(item);
        assertThat(tracker.findAll().size(), is(0));
    }
}
