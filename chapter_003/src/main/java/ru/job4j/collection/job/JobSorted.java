package ru.job4j.collection.job;

import java.util.*;

public class JobSorted {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );

        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
    }
}
