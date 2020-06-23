package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collect() {
        List<Profile>profiles = Arrays.asList(
                new Profile(new Address("Moscow", "First", 11, 111)),
                new Profile(new Address("Kiev", "Second", 22, 222)),
                new Profile(new Address("Minsk", "Third", 33, 333))
        );
        List<Address> expected = Arrays.asList(
                new Address("Moscow", "First", 11, 111),
                new Address("Kiev", "Second", 22, 222),
                new Address("Minsc", "Third", 33, 333)
        );
        assertThat(new Profiles().collect(profiles), is(expected));
    }

    @Test
    public void collectUnique() {
        List<Profile>profiles = Arrays.asList(
                new Profile(new Address("Moscow", "First", 11, 111)),
                new Profile(new Address("Kiev", "Second", 22, 222)),
                new Profile(new Address("Minsk", "Third", 33, 333)),
                new Profile(new Address("Kiev", "Second", 22, 222))
        );
        List<Address> expected = Arrays.asList(
                new Address("Moscow", "First", 11, 111),
                new Address("Kiev", "Second", 22, 222),
                new Address("Minsc", "Third", 33, 333)
        );
        assertThat(new Profiles().collect(profiles), is(expected));
    }
}