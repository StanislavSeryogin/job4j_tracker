package generics.queue;

import exception.QueueEmptyException;
import exception.QueueFullException;
//13.1
public class GenQ {
    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);
        Integer iVal;

        System.out.println("Number queue demonstration Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add " + i + " in queue q");
                q.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting the next number type Integer q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        Double[] dStore = new Double[10];
        GenQueue<Double> q1 = new GenQueue<>(dStore);
        Double dVal;

        System.out.println("Number queue demonstration Double");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add " + (double)i / 2 + " in queue q1");
                q1.put((double)i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting the next number type Double q1: ");
                dVal = q1.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
