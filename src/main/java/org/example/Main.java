package org.example;

import org.example.calculator.SumCalculator;

public class Main {
    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();

        System.out.println(calculator.sum(3));
    }
}