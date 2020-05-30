package generics;

public class TwoGen<T, V> {
    T ob;
    V ob1;

    TwoGen(T o, V o1) {
        ob = o;
        ob1 = o1;
    }

    void showType() {
        System.out.println("Type T - this is " + ob.getClass().getName());
        System.out.println("Type V - this is " + ob1.getClass().getName());
    }

    T getOb() {
        return ob;
    }

    V getOb1() {
        return ob1;
    }
}
