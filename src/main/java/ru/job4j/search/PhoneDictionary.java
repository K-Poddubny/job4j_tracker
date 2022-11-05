package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> searchPhone = s -> s.getPhone().contains(key);
        Predicate<Person> searchName = s -> s.getName().contains(key);
        Predicate<Person> searchSurname = s -> s.getSurname().contains(key);
        Predicate<Person> searchAddress = s -> s.getAddress().contains(key);
        Predicate<Person> searchCombine = searchPhone.or(searchName).or(searchSurname).or(searchAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (searchCombine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}