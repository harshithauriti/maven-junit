package com.codebind.demo_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		assertEquals(10,c.add(5,5));
	}

}
