package com.tactfactory.demo;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private int testAdd(int a, int b) {
        // given
        Calculator calc = new Calculator();

        // when
        int r = calc.add(1, 2);

        return r;
    }

    @Test
    public void testAdd3() {
//        // given
//        Calculator calc = new Calculator();
//
//        // when
//        int r = calc.add(1, 2);

        // then
        Assert.assertEquals(3, this.testAdd(1,  2), 0);
    }

    @Test
    public void testAdd6() {
        int a = 4;
        int b = 2;

        Calculator calc = new Calculator();
        int r = calc.add(a, b);

        Assert.assertEquals(6, r, 0);
    }

    @Test
    public void testSub1() {
        int a = 2;
        int b = 1;

        Calculator calc = new Calculator();
        int r = calc.sub(a, b);

        Assert.assertEquals(1, r, 0);
    }

}
