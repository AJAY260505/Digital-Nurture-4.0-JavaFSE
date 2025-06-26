package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorAddTest.class,
    CalculatorEvenTest.class
})
public class AllTests {
    
}
