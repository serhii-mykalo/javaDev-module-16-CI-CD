package org.example;

import org.example.calculator.SumCalculator;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        SumCalculator calculator = new SumCalculator();
        Logger logger = Logger.getLogger(Main.class.getName());

        logger.info(String.valueOf(calculator.sum(3)));
    }
}