package codingtest.com.fruits;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTesting {

	@Test
	public void calculationTesting() {
		Calculation calculation = new Calculation();
		assertEquals(266, calculation.calculateTotalCost(new Bucket("1", "2", "3", "4", "5")));
		assertEquals(256, calculation.calculateTotalCost(new Bucket("A", "2", "3", "4", "5")));
		assertEquals(0,   calculation.calculateTotalCost(new Bucket("0", "0", "0", "0", "0")));
		assertEquals(236, calculation.calculateTotalCost(new Bucket("1", "*", "3", "4", "5")));
		assertEquals(206, calculation.calculateTotalCost(new Bucket("1", "2", "B", "4", "5")));
		assertEquals(210, calculation.calculateTotalCost(new Bucket("1", "2", "3", "H", "5")));
		assertEquals(156, calculation.calculateTotalCost(new Bucket("1", "2", "3", "4", "=")));
		assertEquals(0, calculation.calculateTotalCost(new Bucket("", "", "", "", "")));
		assertEquals(0, calculation.calculateTotalCost(new Bucket(" ", " ", " ", " ", " ")));
	}

}
