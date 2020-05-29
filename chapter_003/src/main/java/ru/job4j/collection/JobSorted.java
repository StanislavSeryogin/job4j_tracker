package ru.job4j.collection;

import java.util.*;

public class JobSorted {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 1),
                new Job("Reboot server", 2)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
    }
}
