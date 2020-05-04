package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StartUI {
    /*public static void createItem(Input input, Tracker tracker) {
        System.out.println("Create a new Item");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("The Item " + "'" + name + "';" + System.lineSeparator() + "id " + item.getId() + " added;");
    }
    public static void replaceItem(Tracker tracker, Input input) {
        String id = input.askStr("Enter id: ");
        Item name = new Item(input.askStr("Enter name: "));
        boolean newReplace = tracker.replace(id, name);
        if (newReplace) {
            System.out.println(" Item replaced ");
        } else {
            System.out.println(" Item didn't replace ");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean newDelete = tracker.delete(id);
        if (newDelete) {
            System.out.println(" Item deleted ");
        } else {
            System.out.println(" Item didn't delete ");
        }
    }
    public static void showAll(Tracker tracker) {
        System.out.println("Show all items");
        Item[] item = tracker.findAll();
        for (Item value : item) {
            System.out.println(value.toString());
        }
    }
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("Find item by Id");
        String id = input.askStr("Enter id: ");
        System.out.println(tracker.findById(id));
    }
    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("Find items by name");
        String name = input.askStr("Enter name: ");
        System.out.println(Arrays.toString(tracker.findByName(name)));
    }
    public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                int select = Integer.parseInt(input.askStr("Select: "));
                if (select == 0) {
                    StartUI.createItem(input, tracker);
                } else if (select == 1) {
                    StartUI.showAll(tracker);
                } else if (select == 2) {
                    StartUI.replaceItem(tracker, input);
                } else if (select == 3) {
                    StartUI.deleteItem(input, tracker);
                } else if (select == 4) {
                    StartUI.findItemById(input, tracker);
                } else if (select == 5) {
                    StartUI.findItemByName(input, tracker);
                } else if (select == 6) {
                    run = false;
                }
            }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0.Add new Item");
        System.out.println("1.Show all items");
        System.out.println("2.Edit item");
        System.out.println("3.Delete item");
        System.out.println("4.Find item by Id");
        System.out.println("5.Find items by name");
        System.out.println("6.Exit Program");
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }*/

    private final Input input;
    private final Tracker tracker;
    private final Consumer<String> output;

    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    public void init(ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = this.input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(this.input, this.tracker);
        }
    }

    private void showMenu(ArrayList<UserAction> actions) {
        System.out.println("Menu.");
        this.output.accept("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            this.output.accept(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();

        actions.add(new CreateItem());
        actions.add(new ShowAll());
        actions.add(new ReplaceItem());
        actions.add(new DeleteItem());
        actions.add(new FindItemById());
        actions.add(new FindItemByName());
        actions.add(new Exit());

        new StartUI(validate,
                tracker,
                System.out::println).init(actions);

    }
}