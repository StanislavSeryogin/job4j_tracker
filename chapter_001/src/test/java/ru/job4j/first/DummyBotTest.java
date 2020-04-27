package ru.job4j.first;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Hello Bot."),
                is("Hi wise guy.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Buy."),
                is("See you soon.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("How match 2 + 2?"),
                is("It is baffling me, ask another question.")
        );
    }
}
