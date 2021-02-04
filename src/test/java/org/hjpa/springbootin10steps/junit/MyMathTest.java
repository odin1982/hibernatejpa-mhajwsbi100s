package org.hjpa.springbootin10steps.junit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	
	
	//MyMath.sum
	//1,2,3 => 6
	@Test
	public void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}

	@Test
	public void sum_with1number() {
		assertEquals(1, myMath.sum(new int[] {1}));
	}
	
	@Test
	public void test() {
		assertEquals(1, 1);
		assertTrue(true);
		assertFalse(false);
	}
}
