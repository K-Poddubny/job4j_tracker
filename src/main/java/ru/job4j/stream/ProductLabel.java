package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(daysLeft -> daysLeft.getStandard() - daysLeft.getActual() <= 3)
                .filter(daysLeft -> daysLeft.getStandard() - daysLeft.getActual() >= 0)
                .map(result -> new Label(result.getName(), result.getPrice() / 2))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}