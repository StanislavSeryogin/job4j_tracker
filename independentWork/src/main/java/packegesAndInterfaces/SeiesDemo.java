package packegesAndInterfaces;

public class SeiesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++) {
            System.out.println("Following values: " + ob.getNext());
        }

        System.out.println(System.lineSeparator() + "Discharge");
        ob.reset();

        for (int i = 0; i < 5; i++) {
            System.out.println("Following values: " + ob.getNext());

        }

        System.out.println(System.lineSeparator() + "Initial value: 100");
        ob.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Following values: " + ob .getNext());
        }
    }
}
