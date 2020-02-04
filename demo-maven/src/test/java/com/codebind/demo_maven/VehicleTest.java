package com.codebind.demo_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	@Test
	public void test() {
		Vehicle v=new Vehicle();
		assertEquals("Shift Dezire",v.car());
	}

}
