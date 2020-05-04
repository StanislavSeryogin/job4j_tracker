package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<TaskCollection> List) {
        HashSet<String> numbers = new HashSet<>();
        for (TaskCollection task: List) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
