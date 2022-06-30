package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(" ");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("с");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("с");
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}