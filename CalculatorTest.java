import static org.juni.0
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator metoda1;
	
	@Before
	public void setUp() {
		metoda1 = new Calculator(1.0, 2.0);
		System.out.println("BEFORE");
	}

	@After
	public void tearDown() {
		System.out.println("AFTER");
	}

	@Test
	public void testSetValueA() {
		double rezultat = metoda1.getA();
		assertEquals(1.0, rezultat, 0);
	}
	
	@Test
	public void testGetValueA() {
		double rezultat = metoda1.setA(1.0);
		assertEquals(.0, rezultat, 0);
	}

	@Test
	public void testSetValueB() {
		double rezultat = metoda1.setB(2.0);
		assertEquals(2.0, rezultat, 0);

	}
	
	@Test
	public void testGetValueB() {
		metoda1.setB(2);
		assertTrue(metoda1.getB() == 2);

	}
	@Test
	public void testToString() {
		String expected = "CalculatorMethods [variable a = 1.0, variable b = 2.0]";
		assertEquals(expected, metoda1.toString());
	}

}
