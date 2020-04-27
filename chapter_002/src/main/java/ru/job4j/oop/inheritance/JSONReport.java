package ru.job4j.oop.inheritance;

import ru.job4j.oop.inheritance.TextReport;

public class JSONReport extends TextReport {
    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "name : " + name + System.lineSeparator()
                + "body : " + body + System.lineSeparator()
                + "}";
    }
}
