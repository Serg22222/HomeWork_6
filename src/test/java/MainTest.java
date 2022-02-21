import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    public final int SIZE = 10;
    IndexStorage indexStorage = new IndexStorage(SIZE);
    ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(new int[]{1, 2, 3, 4, 5, 6, 7});

    @Test
    public void indexStorgeOutOfBoundsTest() {
        System.out.println(Arrays.toString(indexStorage.size()));
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> indexStorage.get(10));
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> indexStorage.get(-1));
    }

    @Test
    public void positiveOrNegativeValue() {
        int index = new Random().nextInt(10);
        int actual = indexStorage.get(index);
        int expected = index % 2 == 0 ? index : -index;
        assertEquals(expected, actual);
    }

    @Test
    public void setIndexStorageReverseTest(){
        int [] expectedArr = new int[]{-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
        assertEquals(Arrays.toString(expectedArr), Arrays.toString(indexStorage.reverse()));
    }

    @Test
    public void getArrayIndexStorageTest(){
        assertEquals(1, arrayIndexStorage.get(0));
        assertEquals(6, arrayIndexStorage.get(5));
    }

    @Test
    public void sizeArrayIndexStorageTest(){
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7}), Arrays.toString(arrayIndexStorage.size()));
    }
}
