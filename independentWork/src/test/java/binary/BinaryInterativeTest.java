package binary;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinaryInterativeTest {

    @Test
    public void whenFindToKey() {
        int[] arr = {2, 3, 4, 7, 8, 9, 10, 21, 37, 40};
        int result = BinaryInterative.binarySearch(arr, 21);
        assertThat(result, is(7));
    }

    @Test
    public void whenNotFindToKey() {
        int[] arr = {1, 2, 4, 5, 6, 8, 9, 10, 12, 25, 32, 36, 40};
        int result = BinaryInterative.binarySearch(arr, 15);
        assertThat(result, is(-1));
    }
}