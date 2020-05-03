package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book theClean = new Book("Clean code", 85);
        Book theLoop = new Book("Clean code - Loop", 100);
        Book theMethod = new Book("Clean code - Method", 115);
        Book theObjects = new Book("Clean code - Objects", 150);

        Book[] number = new Book[4];
        number[0] = theClean;
        number[1] = theLoop;
        number[2] = theMethod;
        number[3] = theObjects;

        for (Book bk : number) {
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Replacing an Object with a Clean");
        number[0] = theObjects;
        number[3] = theClean;

        for (Book bk : number) {
            System.out.println(bk.getName() + " - " + bk.getPages());
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}
