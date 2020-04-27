package ru.job4j.first;

public class DummyBot {
    public static String answer(String question) {
        String rsl = ("It is baffling me, ask another question.");
        if ("Hello Bot.".equals(question)) {
            rsl = ("Hi wise guy.");
        } else if ("Buy.".equals(question)) {
            rsl = ("See you soon.");
        }
        return rsl;
    }
}
