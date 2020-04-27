package ru.job4j.oop.inheritance;

public class Predator extends Animal {
    private String name;
    public Predator() {
        super();
        System.out.println("Predator");
    }
    public Predator(String name) {
        super();
        this.name = name;
        name = "Predator";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
