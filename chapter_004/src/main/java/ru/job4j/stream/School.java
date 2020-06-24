package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> list = students.stream().filter(
                predict
        ).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("First", 100),
                new Student("Second", 80),
                new Student("Third", 30),
                new Student("Fourth", 60),
                new Student("Fifth", 10)
        );
        System.out.println(students.stream().distinct().collect(
                Collectors.toMap(
                        Student::getSurname,
                        student -> (Object) student
                ))
        );
    }
}
