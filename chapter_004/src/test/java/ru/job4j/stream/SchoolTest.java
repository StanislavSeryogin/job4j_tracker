package ru.job4j.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void whenStudentsTo10A() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("First", 100),
                new Student("Second", 80),
                new Student("Third", 30),
                new Student("Fourth", 60),
                new Student("Fifth", 10)
        );
        Predicate<Student> predicate = student -> (student.getScore() > 70 && student.getScore() <= 100);
        List<Student> result = school.collect(students, predicate);
        List<Student> expect = new ArrayList<>();
        expect.add(students.get(0));
        expect.add(students.get(1));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentsTo10B() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("First", 100),
                new Student("Second", 71),
                new Student("Third", 30),
                new Student("Fourth", 60),
                new Student("Fifth", 10)
        );
        Predicate<Student> predicate = student -> (student.getScore() > 50 && student.getScore() < 70);
        List<Student> result = school.collect(students, predicate);
        List<Student> expect = new ArrayList<>();
        expect.add(students.get(3));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentsTo10C() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("First", 100),
                new Student("Second", 71),
                new Student("Third", 30),
                new Student("Fourth", 60),
                new Student("Fifth", 10)
        );
        Predicate<Student> predicate = student -> (student.getScore() >= 0 && student.getScore() < 50);
        List<Student> result = school.collect(students, predicate);
        List<Student> expect = new ArrayList<>();
        expect.add(students.get(2));
        expect.add(students.get(4));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentsToMap() {
        Student first = new Student("First", 100);
        Student second = new Student("Second", 71);
        Student third = new Student("Third", 30);
        Student fourth = new Student("Fourth", 60);
        Student fifth = new Student("Second", 71);
        School school = new School();
        school.add(first);
        school.add(second);
        school.add(third);
        school.add(fourth);
        school.add(fifth);
        Map<String, Student> exp = new HashMap<>();
        exp.put(first.getSurname(), first);
        exp.put(second.getSurname(), second);
        exp.put(third.getSurname(), third);
        exp.put(fourth.getSurname(), fourth);
        exp.put(fifth.getSurname(), fifth);
        Map<String, Student> rsl = school.studentsMap();
        assertThat(rsl, is(exp));
    }
}