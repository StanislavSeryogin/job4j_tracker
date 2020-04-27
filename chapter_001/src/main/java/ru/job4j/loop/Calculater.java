package ru.job4j.loop;


import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("first number: ");
        double number1 = scan.nextDouble();
        System.out.print("second number: ");
        double number2 = scan.nextDouble();
        System.out.print("operator (+, -, * , /): ");
        char operator = scan.next().charAt(0);
        scan.close();
        double output;
        switch (operator) {
            case '+':
                output = number1 + number2;
                break;
            case '-':
                output = number1 - number2;
                break;
            case '*':
                output = number1 * number2;
                break;
            case '/':
                output = number1 / number2;
                break;

            default:
                System.out.print("Wrong operator");
                return;
        }
        System.out.println(number1 + " " + operator + " " + number2 + ": " + output);
    }
}
