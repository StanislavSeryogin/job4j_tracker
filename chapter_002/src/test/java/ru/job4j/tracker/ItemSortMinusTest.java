package ru.job4j.tracker;

import org.junit.Test;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSortMinusTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item("Stas"),
                new Item("Petr"),
                new Item("Oleg")
        );
        items.sort(new ItemSortMinus());
        assertThat(new String[] {items.get(0).getName(), items.get(1).getName(), items.get(2).getName()},
                is(new String[] {"Stas", "Petr", "Oleg"}));
    }
}