package ru.job4j.stream;

import java.util.*;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        /*Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));*/


        /*Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.sorted().dropWhile(n -> n < 0)
                .forEach(System.out::println);*/


        /*Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");
        Stream.concat(people1, people2).forEach(n -> {
            System.out.print(n + ", ");
        });*/


        /*Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.print(p + ", "));*/


        /*Stream<String> phoneStream = Stream.of("iPhone", "Nokia", "Samsung", "Honor", "Huawei");
        phoneStream.skip(1)
                .limit(2)
                .forEach(System.out::println);*/


        /*List<String> phones1 = new ArrayList<>(Arrays.asList("iPhone", "Nokia", "Huawei",
                "Samsung", "LG", "Xiaomi",
                "ASUS", "Sony", "Meizu",
                "Lenovo"));
        int pageSize = 3; // количество элементов на страницу
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Введите номер страницы: ");
            int page = scanner.nextInt();

            if(page<1) break; // если число меньше 1, выходим из цикла

            phones1.stream().skip((page-1) * pageSize)
                    .limit(pageSize)
                    .forEach(System.out::println);
        }*/


        /*ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Sam", "Bob", "Alice"));
        System.out.println((long) names.size());  // 4
        // количество элементов с длиной не больше 3 символов
        System.out.println(names.stream().filter(n -> n.length() <= 3).count());  // 3*/


        /*ArrayList<String> names1 = new ArrayList<String>();
        names1.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));
        Optional<String> first = names1.stream().findFirst();
        System.out.println(first.get());    // Tom
        Optional<String> any = names1.stream().findAny();
        System.out.println(any);*/


        /*ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Sam", "Bob", "Alice"));
        // есть ли в потоке строка, длина которой больше 3
        boolean any = names.stream().anyMatch(s-> s.length() > 3);
        System.out.println(any);    // true
        // все ли строки имеют длину в 3 символа
        boolean all = names.stream().allMatch(s -> s.length() == 3);
        System.out.println(all);    // false
        // НЕТ ЛИ в потоке строки "Bill". Если нет, то true, если есть, то false
        boolean none = names.stream().noneMatch(s -> s.equals("Bill"));
        System.out.println(none);   // true*/


        /*ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get());  // 1
        System.out.println(max.get());  // 9*/


        //min & max
        /*ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("iPhone", 52000),
                new Phone("Nokia", 35000),
                new Phone("Samsung", 48000),
                new Phone("Honor", 36000)));

        Phone min = phones.stream().min(Phone::compare).get();
        Phone max = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());*/


        //reduce
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
        System.out.println(result.get()); // 720

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x, y) -> x + " " + y);
        System.out.println(sentence.get());

        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone", 54000),
                new Phone("Nokia", 45000),
                new Phone("Samsung", 40000),
                new Phone("LG", 32000));

        int sum = phoneStream.reduce(0,
                (x, y) -> {
                    if(y.getPrice() < 50000)
                        return x + y.getPrice();
                    else
                        return x;
                },
                Integer::sum);

        System.out.println(sum); // 117000
    }
}
