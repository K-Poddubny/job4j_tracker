package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static String cheese = "сыром";

    public PizzaExtraCheese(String toping) {
        super(toping);
    }

    @Override
    public String name() {
        return super.name() + cheese;
    }
}
