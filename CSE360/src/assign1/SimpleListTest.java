/**Michael Fields
 * Class ID: 205
 * Assignment 1
 * 
 * Tests different methods written for SimpleList.java
 */
package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testSimpleList() {
		SimpleList list = new SimpleList();
		assertEquals(0, list.count());
	}

	@Test
	void testAdd() {
		SimpleList list = new SimpleList();
		list.add(1);
		assertEquals(0, list.search(1));
	}

	@Test
	void testRemove() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		list.remove(1);
		assertEquals(-1, list.search(1));
	}

	@Test
	void testCount() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		assertEquals(2, list.count());
	}

	@Test
	void testSearch() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		assertEquals(1, list.search(1));
	}

	@Test
	void testToString() {
		SimpleList list = new SimpleList();
		list.add(1);
		list.add(2);
		assertEquals("2 1 0 0 0 0 0 0 0 0", list.toString());
	}

}
