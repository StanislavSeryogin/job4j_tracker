package binary;

import java.util.Scanner;

public class BinaryInterative {
    static int binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length;

        while (first <= last) {
            int mid = (last + first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
class BinnaryInteractiveTesting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 3, 4, 7, 8, 9, 10, 21, 37, 40};
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        int result = BinaryInterative.binarySearch(arr, number);
        if (result == -1) {
            System.out.println("Element not find");
        } else {
            System.out.println("Element: " + number + System.lineSeparator() + "Found at index: " + result);
        }
    }
}
