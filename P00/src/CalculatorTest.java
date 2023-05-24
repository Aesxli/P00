import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 22012205
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Wednesday 24-05-2023 12:11
 */

/**
 * @author 22012205
 *
 */
public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);

	}
	@Test
	public void testsubtract() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);

	}
	@Test
	public void testmultiple() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);

	}
	@Test
	public void testdivide() {
		
		int a = 0;
		int b = 0;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 2;
		assertEquals ("fail(\"Denominator is 0\");",expected, actual);
		//fail("Denominator is 0");

	}
	@After
	public void tearDown() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
