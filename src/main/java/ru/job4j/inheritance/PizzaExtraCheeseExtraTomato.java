package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static String tomato = " и помидорами";

    public PizzaExtraCheeseExtraTomato(String toping) {
        super(toping);
    }

    @Override
    public String name() {
        return super.name() + tomato;
    }
}
