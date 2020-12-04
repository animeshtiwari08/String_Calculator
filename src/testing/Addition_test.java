package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.NegativeException;
import calculator.StringCalculator;

class Addition_test {

	@Test
	void test_with_no_number() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("");
		assertEquals(0, sum);
	}
	
	@Test
	void test_with_one_number() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("1");
		assertEquals(1, sum);
	}
	
	@Test
	void test_with_two_numbers() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("1,2");
		assertEquals(3, sum);
	}

	@Test
	void test_with_any_numbers() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("1,2,3,4,5");
		assertEquals(15, sum);
	}
	
	@Test
	void test_with_new_line_delim() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("1\n2,3");
		assertEquals(6, sum);
	}
	
	@Test
	void test_with_any_delim() throws NegativeException {
		StringCalculator calculator=new StringCalculator();
		int sum=calculator.add("//;\\n1;2");
		assertEquals(3, sum);
	}
	
	@Test
	void test_with_one_negative() {
		StringCalculator calculator=new StringCalculator();
		try {
		int sum=calculator.add("1,-2,3");
		}
		catch (Exception e) {
			assertEquals("negatives not allowed -2", e.getMessage());
		}
		
	}
	
}
