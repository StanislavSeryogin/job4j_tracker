package ru.job4j.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    private List<Student> students = new ArrayList<>();

    List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(
                predict
        ).collect(Collectors.toList());
    }

    public Map<String, Student> studentsMap() {
        return students.stream()
                .collect(
                        Collectors
                                .toMap(
                                        Student::getSurname,
                                        student -> student,
                                        (first, second) -> first
                                )
                );
    }

    public void add(Student student) {
        this.students.add(student);
    }
}
