package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "===Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        System.out.println(tracker.findById(id));
        if (item != null) {
            System.out.println("=== Item found by Id: " + id + " ===");
        } else {
            System.out.println("Item not found!");
        }
        return true;
    }
}
