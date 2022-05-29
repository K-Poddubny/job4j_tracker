package ru.job4j.inheritance;

public class Pizza {
    private String toping;

    public Pizza(String toping) {
        this.toping = toping;
    }
    public String name() {
        return "Just tasty pizza" + " " + toping;
    }
}
