package ru.job4j.stream;

import java.util.List;

public class StreamAPI {
    public static class Task{
        private final Integer num;

        public Task(Integer num) {
            this.num = num;
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task(1),
                new Task(-2),
                new Task(7),
                new Task(3),
                new Task(0)
        );

        Integer nums = tasks.stream().map(
                task -> task.num
        ).reduce(0, Integer::sum);
        System.out.println(nums);
    }//
}
