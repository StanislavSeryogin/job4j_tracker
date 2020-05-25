package methods;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factR() {
        Factorial r = new Factorial();
        int result = r.factR(4);
        assertThat(result, is(24));
    }

    @Test
    public void factI() {
        Factorial i = new Factorial();
        int result = i.factI(6);
        assertThat(result, is(720));
    }
}