package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Закомнированно с использованием var;
 */

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /*public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (person.getName().contains(key)
                    || person.getAddress().contains(key)
                    || person.getPhone().contains(key)
                    || person.getSurname().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }*/

    public ArrayList<Person> find(String key) {
        Predicate<Person> contName = (persons) -> persons.getName().contains(key);
        Predicate<Person> contSurname = (persons) -> persons.getSurname().contains(key);
        Predicate<Person> contPhone = (persons) -> persons.getPhone().contains(key);
        Predicate<Person> contAddress = (persons) -> persons.getAddress().contains(key);
        var combine = contName.or(contSurname.or(contPhone.or(contAddress)));
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
