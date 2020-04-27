package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item name = new Item(input.askStr("Enter name: "));
        boolean aReplace = tracker.replace(id, name);
        if (aReplace) {
            System.out.println(" Item replaced");
        } else {
            System.out.println(" Item didn't replace");
        }
        return true;
    }
}
