package stringSort;

import java.util.*;

public class Sort {
    public static void main(String[] args){
        List<String> app = new ArrayList<>();
        app.add("apple");
        app.add("banana");
        app.add("kiwi");
        for (Object val : app) {
            System.out.println(val);
        }
        System.out.println();

        Set<String> app1 = new HashSet<>();
        app1.add("apple");
        app1.add("apple");
        app1.add("banana");
        app1.add("kiwi");
        for (Object val: app1){
            System.out.println(val);
        }
        System.out.println();

        Set<String> app2 = new TreeSet<>();
        app2.add("apple");
        app2.add("apple");
        app2.add("banana");
        app2.add("kiwi");
        System.out.println(app2 + System.lineSeparator());

        Map<String, Integer> app3 = new HashMap<>();
        app3.put("apple", 1);
        app3.put("apple", 2);
        app3.put("banana", 3);
        app3.put("kiwi", 4);
        System.out.println(app3);
    }
}