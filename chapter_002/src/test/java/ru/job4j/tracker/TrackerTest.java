package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class TrackerTest {
    /**
     * Обратите внимания на тесты.
     * Не уверен что все правильно понял.
     */

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenfindById() {
        Tracker tracker = new Tracker();
        Item id = new Item("test1");
        tracker.add(id);
        Item result = tracker.findById(id.getId());
        assertThat(result.getName(), is(id.getName()));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();
        Item name = new Item("test1");
        tracker.add(name);
        Item result = tracker.findById(name.getId());
        assertThat(result.getName(), is(name.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();
        Item position = new Item("test1");
        tracker.add(position);
        Item result = tracker.findById(position.getId());
        assertThat(result.getName(), is(position.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}