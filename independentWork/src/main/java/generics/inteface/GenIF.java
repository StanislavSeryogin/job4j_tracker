package generics.inteface;

public class GenIF {
    public static void maid(String[] args) {
        Integer[] x = {1, 2, 3};
        MyClass<Integer> ob = new MyClass<>(x);

        if (ob.contains(2)) {
            System.out.println("2 contains in ob");
        } else {
            System.out.println("2 not contained in ob");
        }

        if (ob.contains(5)) {
            System.out.println("5 contains in ob");
        } else {
            System.out.println("5 not contained in ob");
        }

        // if (ob.contains(9.25)) error, only Integer
    }
}
