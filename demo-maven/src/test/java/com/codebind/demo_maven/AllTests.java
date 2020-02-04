package com.codebind.demo_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, CalculatorTest.class, VehicleTest.class })
public class AllTests {

}
