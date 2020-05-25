package methods;

public class Queue {
    private  char q[];
    private  int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (char ch : a) {
            put(ch);
        }
    }

    void put(char ch) {
        if (putloc == q.length - 1 ) {
            System.out.println(" - Queue is full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Queue is full");
            return (char) 0;
        }
        return q[getloc++];
    }
}
