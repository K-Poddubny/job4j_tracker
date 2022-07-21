package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentLess0() {
        Fact fact = new Fact();
        fact.cal(-1);
    }
}