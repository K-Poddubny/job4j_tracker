package ru.job4j.tracker;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemAscByNameTest {

    @Test
    public void whenItemAscByNameThenSortedAsc() {
        Item petr = new Item("Petr");
        Item vasya = new Item("Vasya");
        Item alisa = new Item("Alisa");
        List<Item> items = new ArrayList<>(List.of(
                petr,
                vasya,
                alisa
        ));
        List<Item> expected = List.of(
                alisa,
                petr,
                vasya
        );
        Collections.sort(items, new ItemAscByName());
        assertEquals(expected, items);
    }
}