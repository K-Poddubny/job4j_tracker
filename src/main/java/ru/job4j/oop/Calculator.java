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

    public int sumAllOperation(int sum, int minus, int divide, int multiply) {
        return sum + minus + divide + multiply;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        Calculator calculator1 = new Calculator();
        int rsl2 = calculator1.divide(10);
        System.out.println(rsl2);
        int rsl3 = minus(22);
        System.out.println(rsl3);
        Calculator calculator3 = new Calculator();
        int rsl4 = calculator3.sumAllOperation(result, rsl, rsl2, rsl3);
        System.out.println(rsl4);

    }
}
