package methods;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class VarArgs3Test {

    @Test
    public void vaTestInt() {
        VarArgs3 varArgs3 = new VarArgs3();
        int result = varArgs3.vaTest(1, 2, 3);
        assertThat(result, is(3));
    }
}