package ru.job4j.oop;

import java.util.Scanner;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var petya = new Jukebox();
        System.out.print("Твой выбор: ");
        int x = in.nextInt();
        petya.music(x);
    }
}
