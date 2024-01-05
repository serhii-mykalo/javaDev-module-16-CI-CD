package org.example;

import org.example.calculator.SumCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testMain() {
        SumCalculator calculator = new SumCalculator();

        assertEquals(6, calculator.sum(3));
    }
}
