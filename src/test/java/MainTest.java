import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    public final int SIZE = 10;
    IndexStorage indexStorage = new IndexStorage(SIZE);

    @Test
    public void indexStorgeOutOfBoundsTest() {
        System.out.println(Arrays.toString(indexStorage.size()));
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> indexStorage.get(10));
    }

    @Test
    public void positiveOrNegativeValue() {
        int index = new Random().nextInt(10);
        int actual = indexStorage.get(index);
        int expected = index % 2 == 0 ? index : -index;
        assertEquals(expected, actual);
    }
}
