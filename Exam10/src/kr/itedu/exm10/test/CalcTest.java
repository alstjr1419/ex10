package kr.itedu.exm10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void sumTest() {
		assertEquals(7, Calc.sum(3, 4));
		assertEquals(25, Calc.sum(12, 13));
		assertEquals(579, Calc.sum(123, 456));
	}

}
