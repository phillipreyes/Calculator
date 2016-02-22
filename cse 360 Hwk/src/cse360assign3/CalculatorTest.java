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
		assertEquals(5,test.getTotal());
	
	}
	@Test
	public void testAdd () {
		
		Calculator test= new Calculator();
		test.add(5);
		assertEquals(0,test.getTotal());
		
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
		test.divide(0);
		assertEquals(0,test.getTotal());
	}
	@Test
	public void testgetHistory () {
		
		Calculator test= new Calculator();
		fail("Not yet implemented");
	
	}
}
