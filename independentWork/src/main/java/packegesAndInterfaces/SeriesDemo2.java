package packegesAndInterfaces;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Following values ByTwo; " + ob.getNext());

            ob = threeOb;
            System.out.println("Following values Next byThrees: " + ob.getNext());
        }
    }
}