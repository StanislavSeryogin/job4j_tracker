package methods;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SumItTest {

    @Test
    public void sum() {
        SumIt sumIt = new SumIt();
        int result = sumIt.sum(1, 2, 3);
        assertThat(result, is(6));
    }
}