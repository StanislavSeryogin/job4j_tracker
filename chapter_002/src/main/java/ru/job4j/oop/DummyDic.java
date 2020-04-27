package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        return "First";
    }
    public static void main(String[] args) {
        DummyDic first = new DummyDic();
        String say = first.engToRus();
        System.out.println("Неизвестное слово: " + say);
    }
}
