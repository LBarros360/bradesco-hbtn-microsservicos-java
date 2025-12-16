package com.example.calculator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ===================== SUM =====================
    @Test
    @DisplayName("Deve somar dois números corretamente")
    void shouldSumTwoNumbers() {
        Double result = calculator.sum(10.0, 5.0);
        assertEquals(15.0, result);
    }

    @Test
    void shouldThrowExceptionWhenSumWithNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.sum(null, 5.0));
    }

    // ===================== SUB =====================
    @Test
    void shouldSubtractTwoNumbers() {
        Double result = calculator.sub(10.0, 3.0);
        assertEquals(7.0, result);
    }

    @Test
    void shouldThrowExceptionWhenSubWithNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.sub(10.0, null));
    }

    // ===================== DIVIDE =====================
    @Test
    void shouldDivideTwoNumbers() {
        Double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result);
    }

    @Test
    void shouldThrowArithmeticExceptionWhenDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(10.0, 0.0));
    }

    @Test
    void shouldThrowExceptionWhenDivideWithNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.divide(null, 2.0));
    }

    // ===================== FACTORIAL =====================
    @Test
    void shouldCalculateFactorial() {
        Integer result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    void shouldReturnOneWhenFactorialIsZero() {
        Integer result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    void shouldThrowExceptionWhenFactorialIsNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.factorial(null));
    }

    @Test
    void shouldThrowExceptionWhenFactorialIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.factorial(-1));
    }

    // ===================== INTEGER TO BINARY =====================
    @Test
    void shouldConvertIntegerToBinary() {
        Integer result = calculator.integerToBinary(5);
        assertEquals(101, result);
    }

    @Test
    void shouldThrowExceptionWhenIntegerToBinaryIsNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.integerToBinary(null));
    }

    // ===================== INTEGER TO HEXADECIMAL =====================
    @Test
    void shouldConvertIntegerToHexadecimal() {
        String result = calculator.integerToHexadecimal(170);
        assertEquals("AA", result);
    }

    @Test
    void shouldThrowExceptionWhenIntegerToHexadecimalIsNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.integerToHexadecimal(null));
    }

    // ===================== DATE DIFFERENCE =====================
    @Test
    void shouldCalculateDaysBetweenDates() {
        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);

        int result = calculator.calculeDayBetweenDate(date1, date2);

        assertEquals(14, result);
    }

    @Test
    void shouldThrowExceptionWhenDatesAreNull() {
        assertThrows(NullPointerException.class,
                () -> calculator.calculeDayBetweenDate(null, LocalDate.now()));
    }
}
