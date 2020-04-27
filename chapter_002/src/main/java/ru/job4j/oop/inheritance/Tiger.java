package ru.job4j.oop.inheritance;

public class Tiger extends Predator {
    private String name;
    public Tiger() {
        super();
        System.out.println("Tiger");
    }
    public Tiger(String name) {
        super();
        this.name = name;
        name = "Tiger";
        System.out.println(name);
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
    }
}
