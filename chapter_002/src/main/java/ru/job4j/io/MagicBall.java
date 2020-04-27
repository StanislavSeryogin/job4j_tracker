package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? " + System.lineSeparator() + "Your choice: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Yes! It's number: " + name);
        } else if (answer == 1) {
            System.out.println("No. You entered " + name);
        } else {
            System.out.println("May be... You entered " + name);
        }
    }
}
