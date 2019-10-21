package com.tactfactory.demo;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void test3() {
        int a = 1;
        int b = 2;

        Calculator calc = new Calculator();
        int r = calc.add(a, b);

        Assert.assertEquals(3, r, 0);
    }

    @Test
    public void test6() {
        int a = 4;
        int b = 2;

        Calculator calc = new Calculator();
        int r = calc.add(a, b);

        Assert.assertEquals(6, r, 0);
    }

}
