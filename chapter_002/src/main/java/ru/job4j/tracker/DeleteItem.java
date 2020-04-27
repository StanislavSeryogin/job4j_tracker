package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean newDelete = tracker.delete(id);
        if (newDelete) {
            System.out.println(" Item deleted ");
        } else {
            System.out.println(" Item didn't delete ");
        }
        return true;
    }
}
