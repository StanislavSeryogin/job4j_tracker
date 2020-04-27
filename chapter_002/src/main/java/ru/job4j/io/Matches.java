package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("Game: Eleven matches");
        System.out.println("You can take from one to three matches.");
        System.out.println("Whoever takes the last matches will Win.");
        int count = 11;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("The number of matches on the table: " + count);
            System.out.println("First player move: ");
            int player1 = Integer.parseInt(input.nextLine());
            count -= player1;
            if (count <= 0) {
                System.out.println("First player Win!");
                break;
            }
            System.out.println("The number of matches on the table: " + count);
            System.out.println("Second player move: ");
            int player2 = Integer.parseInt(input.nextLine());
            count -= player2;
            if (count <= 0) {
                System.out.println("Second player Win!");
                break;
            }
        }
    }
}
