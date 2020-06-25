package ru.job4j.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    /*List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> list = students.stream().filter(
                predict
        ).collect(Collectors.toList());
        return list;
    }*/

    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(
                predict
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("First", 100),
                new Student("Second", 80),
                new Student("Third", 30),
                new Student("Fourth", 60),
                new Student("Fifth", 10)
        );

        Map<String, Student> map = list.stream().collect(Collectors.toMap(
                Student::getSurname,
                student -> student)
        );
        Map<String,Student> map1 = new HashMap<>();
        for (Student i : list) map1.put(i.getSurname(),i);

        Map<String, Student> map2 =
                list.stream().collect(Collectors.toMap(Student::getSurname, Student -> Student));
        map2.forEach((x, y) -> System.out.println(x + " -- " + y));
    }
}
