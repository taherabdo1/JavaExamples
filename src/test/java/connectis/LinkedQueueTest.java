package connectis;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import connectis.LinkedQueue;

@SuppressWarnings("deprecation")
public class LinkedQueueTest {

	LinkedQueue<String> queue;

	//initialize the queue
	@Before
	public void init() {
		queue = new LinkedQueue<String>();
	}

	//test enqueue and then dequeue
	@SuppressWarnings("deprecation")
	@Test
	public void testEnqueue() {
		queue.enqueue("taher");

		Assert.assertEquals("taher", queue.dequeue());
		Assert.assertNull(queue.dequeue());
	}

	//test dequeue empty
	@Test
	public void testEnqueue1() {
		Assert.assertNull(queue.dequeue());
	}

	//test not null if the queue has values
	@Test
	public void testEnqueue2() {
		queue.enqueue("robert");
		Assert.assertNotNull(queue.dequeue());
	}

	//test fifo and enqueue after totally dequeue the queue.
	@Test
	public void testEnqueueBigOrder() {
		queue.enqueue("robert1");
		queue.enqueue("robert2");
		queue.enqueue("robert3");
		Assert.assertEquals("robert1", queue.dequeue());
		Assert.assertEquals("robert2", queue.dequeue());
		Assert.assertEquals("robert3", queue.dequeue());
		queue.enqueue("taher");
		Assert.assertEquals("taher", queue.dequeue());

	}

}
