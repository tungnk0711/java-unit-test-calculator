package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd0and0() {
        int a = 0;
        int b = 0;
        int expected = 0;

        int res = Calculator.add(a, b);

        assertEquals(expected, res);
    }

    @Test
    public void testAdd1and1() {
        int a = 1;
        int b = 1;
        int expected = 2;

        int res = Calculator.add(a, b);

        assertEquals(expected, res);

    }

    @Test
    public void testAdd1and0() {
        int a = 1;
        int b = 0;
        int expected = 1;

        int res = Calculator.add(a, b);

        assertEquals(expected, res);

    }

    @Test
    public void testAdd0and1() {
        int a = 0;
        int b = 1;
        int expected = 1;

        int res = Calculator.add(a, b);

        assertEquals(expected, res);

    }
}