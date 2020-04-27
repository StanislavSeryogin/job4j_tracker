package ru.job4j.tracker;

public class ShowAll implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Show all items");
        Item[] item = tracker.findAll();
        for (Item value : item) {
            System.out.println(value.toString());
        }
        return true;
    }
}
