package com.example.L20240219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals(3,calculatorService.plus(1,2));
        assertEquals(1,calculatorService.plus(-1,2));
    }

    @Test
    void testMinus() {
        assertEquals(-1,calculatorService.minus(1,2));
        assertEquals(-3,calculatorService.minus(-1,2));
    }
    @Test
    void testMultiply() {
        assertEquals(2,calculatorService.multiply(1,2));
        assertEquals(-2,calculatorService.multiply(-1,2));
    }
    @Test
    void testDivide() {
        assertEquals(0,calculatorService.divide(1,2));
        assertEquals(0,calculatorService.divide(-1,2));
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(1,0));
    }
}