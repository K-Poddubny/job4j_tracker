package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int rsl) {
        return x + sum(rsl) + multiply(rsl) + minus(rsl) + divide(rsl);
    }

    public static void main(String[] args) {
        int result = sum(1);
        System.out.println(result);
        int rsl = minus(20);
        System.out.println(rsl);
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(50));
        System.out.println(calculator.multiply(7));
        int resSum = 10;
        System.out.println(calculator.sumAllOperation(resSum));
    }
}
