package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testSumThatOneHandledCorrectly() {
        // Given
        int a = 1;

        // When
        long result = sumCalculator.sum(a);

        // Then
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void testSumThatThreeHandledCorrectly() {
        // Given
        int b = 3;

        // When
        long result = sumCalculator.sum(b);

        // Then
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    void testSumThatZeroIllegalArgument() {
        // Given
        int c = 0;

        // When & Then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> sumCalculator.sum(c)
        );
    }
}
