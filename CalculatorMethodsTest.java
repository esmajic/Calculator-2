import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorMethodsTest {

	CalculatorMethods metoda;

	@Before
	public void setUp() {
		metoda = new CalculatorMethods();
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
		assertEquals(4, result, 0);
	}

	@Test
	public void shouldReturnSubtractionOfTwoNumbers() {
		double result = metoda.subtraction(2, 2);
		assertEquals(0, result, 0);
	}

	@Test
	public void shouldReturnMultiplicationOfTwoNumbers() {
		double result = metoda.multiplication(2, 2);
		assertEquals(4, result, 0);
	}

	@Test
	public void shouldReturnDivisionOfTwoNumbers() {
		double result = metoda.division(2, 2);
		assertEquals(1, result, 0);
	}

	@Test
	public void shouldReturnSquareRootOfVariableA() {
		double result = metoda.sqrt(2);
		assertEquals(1.4142135623730951, result, 0);
	}

	@Test
	public void shouldReturnSquareOfVariableA() {
		double result = (double) metoda.square(2);
		assertEquals(4, result, 0);
	}

}
