package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("Количество пассажиров");
    }

    @Override
    public int refuel(int petrol) {
        int price = petrol * 2;
        return price;
    }
}