package task4;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class PrimeNumberSearcherTest {
    @Test
    public void test(){
        PrimeNumberSearcher searcher = new PrimeNumberSearcher();

        int[] expectedResult = {1, 3, 5};
        int[] realResult = searcher.search(25, 1, 18, 7, 26, 19, 1256, 78);
        assertArrayEquals(realResult, expectedResult);

        expectedResult = new int[0];
        realResult = searcher.search(25, 56, 128);
        assertArrayEquals(realResult, expectedResult);

    }
}
