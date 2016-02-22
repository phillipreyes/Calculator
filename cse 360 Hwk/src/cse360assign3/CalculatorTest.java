package cse360assign3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void test() {
		
		fail("Not yet implemented");
	}
	@Test
	public void testCalculator(){
		
		Calculator test= new Calculator();
		assertNotNull(test);
	}
	
	@Test
	public void testGetTotal () {
		
		Calculator test= new Calculator();
		test.add(5);
		test.multiply(5);
		test.subtract(15);
		test.multiply(2);
		test.divide(1);
		assertEquals(20,test.getTotal());
	
	}
	@Test
	public void testAdd () {
		
		Calculator test= new Calculator();
		test.add(5);
		assertEquals(5,test.getTotal());
		
	}
	@Test
	public void testSubtract () {
		
		Calculator test= new Calculator();
		test.subtract(8);
		assertEquals(-8,test.getTotal());
	}
	
	@Test
	public void testMultiply () {
		
		Calculator test= new Calculator();
		test.multiply(5);
		assertEquals(0,test.getTotal());
	}
	
	@Test
	public void testDivide () {
		
		Calculator test= new Calculator();
		test.divide(9);
		assertEquals(0,test.getTotal());
	}
	@Test
	public void testDivideByZero(){
		
		Calculator test= new Calculator();
		test.add(5);
		test.add(6);
		test.multiply(2);
		test.divide(0);
		assertEquals(0,test.getTotal());
	}
	@Test
	public void testgetHistory () {
		
		Calculator test= new Calculator();
		test.add(5);
		test.multiply(5);
		test.subtract(15);
		test.multiply(2);
		test.divide(1);
		assertEquals("0 + 5 * 5 - 15 * 2 / 1",test.getHistory());
	
	}
	@Test
	public void  addHistory(){
		
		Calculator test= new Calculator();
		test.add(5);
		test.multiply(5);
		assertEquals("0 + 5 * 5",test.getHistory());
		
		
	}
}
