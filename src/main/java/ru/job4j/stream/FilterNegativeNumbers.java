package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 2, 8, 3, -16, -7, 5);
        List<Integer> positive = numbers.stream().filter(s -> s > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
