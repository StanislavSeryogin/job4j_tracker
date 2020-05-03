package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Bruce");
        student.setLastName("Wayne");
        student.setFaculty("Batman.");
        student.setDate(new Date());

        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("faculty: " + student.getFaculty()  + System.lineSeparator() + student.getDate());
    }
}
