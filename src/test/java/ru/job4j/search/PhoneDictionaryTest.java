package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        // given
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        // when
        ArrayList<Person> persons = phones.find("Petr");
        // then
        assertEquals(persons.get(0).getSurname(), "Arsentev");
    }

    @Test
    public void whenFindByNotExistedName() {
        // given
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        // when
        ArrayList<Person> persons = phones.find("Vasya");
        // then
        assertTrue(persons.isEmpty());
    }
}