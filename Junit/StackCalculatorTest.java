package java;
import static org.junit.Assert.*;

import org.junit.Test;

import originalCalculator.StackCalculator;

public class TestStackCalculator {

	@Test
	public void subtractTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(-4.0, c.calculate("1,2,3,+,-"),2);
	}

	@Test
	public void pluTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(3.0, c.calculate("1,2,+"),2);
	}

	@Test
	public void divideTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(4.0, c.calculate("6,2,*,3,/"),2);
	}

	@Test
	public void percentageTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(1.0, c.calculate("50,%,2,*"),2);
	}

	@Test
	public void powerTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(17.0, c.calculate("2,3,^,4,5,+,+"),2);
	}

	@Test
	public void factorialTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(26.0, c.calculate("3,!,4,5,*,+"),2);
	}

	@Test
	public void factorialTest2() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(24.0, c.calculate("12,3,/,!"),2);
	}

	@Test
	public void sevenTest() throws Exception {
		StackCalculator c = new StackCalculator();
		assertEquals(14.0, c.calculate("5,1,2,+,4,*,+,3,-"),2);
	}

	@Test
	public void exceptionTest1(){
		try{
			StackCalculator c = new StackCalculator();
			c.calculate("2,2,+,2");
		}catch(Exception e){
			assertEquals("invalid expression", e.getMessage());
		}
	}
	
	@Test
	public void exceptionTest2() throws Exception {
		try{
			StackCalculator c = new StackCalculator();
			c.calculate("");
		}catch(Exception e){
			assertEquals("empty expression", e.getMessage());
		}
	}
	
	@Test
	public void exceptionTest3() throws Exception {
		try{
			StackCalculator c = new StackCalculator();
			c.calculate("+,2,2");
		}catch(Exception e){
			assertEquals("invalid expression", e.getMessage());
		}
	}
	
	@Test
	public void exceptionTest5() throws Exception {
		try{
			StackCalculator c = new StackCalculator();
			c.calculate(",,,");
		}catch(Exception e){
			assertEquals("invalid expression", e.getMessage());
		}
	}
	
	@Test
	public void exceptionTest4() throws Exception {
		try{
			StackCalculator c = new StackCalculator();
			c.calculate("2,+,2");
		}catch(Exception e){
			assertEquals("invalid expression", e.getMessage());
		}
	}

}
