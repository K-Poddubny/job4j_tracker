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

    public static void main(String[] args) {
        PizzaExtraCheese pizza = new PizzaExtraCheese("с ");
        System.out.println(pizza.name());
    }
}
