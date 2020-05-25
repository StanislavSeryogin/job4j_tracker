package packegesAndInterfaces;

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size++];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is empty");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}

