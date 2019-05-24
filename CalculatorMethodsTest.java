import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorMethodsTest {

	CalculatorMethods metoda;
	Calculator metoda1;

	@Before
	public void setUp() {
		metoda = new CalculatorMethods();
		metoda1 = new Calculator(1, 2);
		System.out.println("BEFORE");
		;
	}

	@After
	public void terDown() {
		System.out.println("AFTER");
	}

	@Test
	public void shouldReturnSumOfTwoNumbers() {
		double result = metoda.addition(2, 2);
		assertEquals(4.0, result, 0);
	}

	@Test
	public void shouldReturnSubtractionOfTwoNumbers() {
		double result = metoda.subtraction(2, 2);
		assertEquals(0.0, result, 0);
	}

	@Test
	public void shouldReturnMultiplicationOfTwoNumbers() {
		double result = metoda.multiplication(2, 2);
		assertEquals(4.0, result, 0);
	}

	@Test
	public void shouldReturnDivisionOfTwoNumbers() {
		double result = metoda.division(2, 2);
		assertEquals(1.0, result, 0);
	}

	@Test
	public void shouldReturnSquareRootOfVariableA() {
		double result = metoda.sqrt(2);
		assertEquals(1.4142135623730951, result, 0);
	}
	
	@Test
	public void shouldReturnPowOfVariableA() {
		double result = metoda.square(2);
		assertEquals(4.0 , result, 0);
	}

	@Test
	public void testSetValueA() {
		metoda1.setA(1);
		assertTrue(metoda1.getA() == 1);
	}
	
	@Test
	public void testGetValueA() {
		metoda1.setA(1);
		assertTrue(metoda1.getA() == 1);
	}

	@Test
	public void testSetValueB() {
		metoda1.setB(2);
		assertTrue(metoda1.getB() == 2);

	}
	
	@Test
	public void testGetValueB() {
		metoda1.setB(2);
		assertTrue(metoda1.getB() == 2);

	}
}
