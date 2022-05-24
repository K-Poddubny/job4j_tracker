package ru.job4j.max;

import java.sql.SQLOutput;

public class Reduce {
    private int[] array;

    public void to(int[] number) {
        this.array = number;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(num);
        reduce.print();
    }
}
