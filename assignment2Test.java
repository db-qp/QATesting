import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class assignment2Test {
	
	//  credit card number = 16 digits & last digit = 0
	@Test
	void T1() {
		assertEquals("Valid Card", Assignment2.Validate(3225145643589795L));
	}
	
	// 	credit card number = 16 digits & last digit ≠ 0
	@Test
	void T2() {
		assertEquals("Invalid Card", Assignment2.Validate(3125145643589795L));
	}
	
	//  credit card number > 16 digits & last digit = 0
	@Test
	void T3() {
		assertEquals("Invalid card number, need to have 16 digits", Assignment2.Validate(13125145643589795L));
	}
	
	//  credit card number > 16 digits & last digit ≠ 0
	@Test
	void T4() {
		assertEquals("Invalid card number, need to have 16 digits", Assignment2.Validate(53125145643589795L));
	}
	
	//  credit card number < 16 digits & last digit = 0
	@Test
	void T5() {
		assertEquals("Invalid card number, need to have 16 digits", Assignment2.Validate(825145643589795L));
	}
	
	//  credit card number < 16 digits & last digit ≠ 0
	@Test
	void T6() {
		assertEquals("Invalid card number, need to have 16 digits", Assignment2.Validate(125145643589795L));
	}

}
