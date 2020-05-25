package methods;

public class QSDemo {
    public static void main(String[] args) {
        char[] a = {'c', 'e', 'a', 'f', 'b', 'j', 'd'};
        int i;
        System.out.print("Source array: ");
        for(i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        QuickSort.qsort(a);

        System.out.print("Sorted array: ");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
