package ru.x5.Lesson5.task1;

public class Calculator {


    public static void addition(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA + tempB));
        }
    }

    public static void deduction(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA - tempB));
        }
    }

    public static void multiplication(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA * tempB));
        }
    }

    public static void division(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            Input exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA / tempB));
        }
    }
}