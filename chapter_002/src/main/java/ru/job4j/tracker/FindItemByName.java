package ru.job4j.tracker;

public class FindItemByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findByName("fix bug")) {
            System.out.println(item.getId() + " " + item.getName());
        }
        return true;
    }
}
