package priority;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Package for class .
 *
 * @author Maxim Ignashov (mailto:ignashov.m@icloud.com)
 * @version 1.0
 * @since 14.07.2018
 */
public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("high", 9));
        queue.put(new Task("high", 8));
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 2));
        queue.put(new Task("middle", 7));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 6));
        queue.put(new Task("middle", 10));
        queue.put(new Task("middle", 4));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
