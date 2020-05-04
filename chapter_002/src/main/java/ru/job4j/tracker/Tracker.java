package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

public class Tracker {

    private final ArrayList<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    public ArrayList<Item> findAll() {
        return items;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        return (indexOf(id) != -1) ? (items.get(indexOf(id))) : (null);
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> itemsIncludeKey = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemsIncludeKey.add(item);
            }
        }
        return itemsIncludeKey;
    }

    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.set(index, item);
            item.setId(id);
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(index);
            rsl = true;
        }
        return rsl;
    }
}
