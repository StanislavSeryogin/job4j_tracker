package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortPlusTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Stas"),
                new Item("Petr"),
                new Item("Oleg")
        );
        items.sort(new ItemSortPlus());
        assertThat(new String[] {items.get(0).getName(), items.get(1).getName(), items.get(2).getName()},
                is(new String[] {"Oleg", "Petr", "Stas"}));
    }
}