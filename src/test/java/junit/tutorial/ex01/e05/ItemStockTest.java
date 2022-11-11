package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ItemStockTest {

	ItemStock itemStock = new ItemStock();
	Item item1 = new Item("book", 500);
	Item item2 = new Item("CD",2000);
	
	
	@Test
	void test() {
		int result = itemStock.getNum(item1);
		assertEquals(0, result);
	}

	@Test
	void test2() {
		itemStock.add(item1);
		int result = itemStock.getNum(item1);
		assertEquals(1, result);
	}
	
	@Test
	void test3() {
		itemStock.add(item1);
		itemStock.add(item1);
		int result = itemStock.getNum(item1);
		assertEquals(2, result);
	}
	
	@Test
	void test4() {
		itemStock.add(item1);
		itemStock.add(item2);
		int result = itemStock.getNum(item1);
		assertEquals(1, result);
	}
	
}
