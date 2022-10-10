package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] left1 = left.split("\\.");
        String[] right2 = right.split("\\.");
        int leftInt = Integer.parseInt(left1[0]);
        int rightInt = Integer.parseInt(right2[0]);
        return Integer.compare(leftInt, rightInt);
    }
}