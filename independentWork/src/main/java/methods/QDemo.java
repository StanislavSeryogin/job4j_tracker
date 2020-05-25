package methods;

public class QDemo {
    public static void main(String[] args) {
        Queue q1 = new Queue(26);

        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);

        char ch;
        int i;
        String l = System.lineSeparator();

        for (i = 0; i < 26; i++) {
            q1.put((char) ('A' + i));
        }

        Queue q3 = new Queue(q1);
        System.out.print("Content q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println(l);

        System.out.print("Content q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println(l);

        System.out.print("Content q3: ");
        for (i = 0; i < 26; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
