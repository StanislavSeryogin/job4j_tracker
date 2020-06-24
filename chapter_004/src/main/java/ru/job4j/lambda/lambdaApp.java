package ru.job4j.lambda;

import java.util.Scanner;
import java.util.function.Supplier;

public class lambdaApp {
    public static void main(String[] args) {
        Supplier<User>  useFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user = useFactory.get();
        User user1 = useFactory.get();

        System.out.println("Name user: " + user.getName());
        System.out.println("Name user1: " + user1.getName());
    }
}
