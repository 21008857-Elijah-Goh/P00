import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorD1Test {
int a, b;
CalculatorD1 cal;
	@Before
	public void setUp() throws Exception {
	}
	

	@Test
	public void testadd() {
		int a=123;
		int b=321;
		CalculatorD1 cal = new CalculatorD1();
		
		int actual = cal.add(a,b);
		int expected = 5555;
		
	}		
	@Test
		public void testsub() {
			
		int a=123;
		int b=321;
		CalculatorD1 cal = new CalculatorD1();
		
			int actual = cal.sub(a,b);
			int expected = 5555;
			
			
		}	
	@Test
		public void testmul() {
						
		int a=123;
		int b=321;
		CalculatorD1 cal = new CalculatorD1();
		
			int actual = cal.mul(a,b);
			int expected = 39483;
		}
	@Test
		public void testdiv() {
		
		int a=123;
		int b=321;
		CalculatorD1 cal = new CalculatorD1();
		
			int actual = cal.div(a,b);
			int expected = 233;
	}	
	@After
	public void tearDown() throws Exception {
	}

	

}
