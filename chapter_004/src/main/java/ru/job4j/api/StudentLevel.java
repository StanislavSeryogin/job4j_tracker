package ru.job4j.api;

import ru.job4j.stream.Student;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(score -> score.getScore() > bound)
                .collect(Collectors.toList());
    }
}
