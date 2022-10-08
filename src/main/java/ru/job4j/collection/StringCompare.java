package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int count = Integer.compare(left.length(), right.length());
        for (int i = 0; i < left.length(); i++) {
            int rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                count += rsl;
                break;
            }
        }
        return count;
    }
}