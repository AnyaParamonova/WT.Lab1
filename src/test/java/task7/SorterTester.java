package task7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class SorterTester {
    @Test
    public void test(){
        Sorter sorter = new Sorter();

        double[] expectedResult = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedResult, sorter.sort(4, 5, 1, 6, 3, 2), 0.0001);
        assertArrayEquals(expectedResult, sorter.sort(1, 2, 3, 4, 5, 6), 0.0001);
        assertArrayEquals(expectedResult, sorter.sort(6, 5, 4, 3, 2, 1), 0.0001);

        expectedResult = new double[]{0, 0, 0, 0, 0, 0};
        assertArrayEquals(expectedResult, sorter.sort(0, 0, 0, 0, 0, 0), 0.0001);

        expectedResult = new double[0];
        assertArrayEquals(expectedResult, sorter.sort(), 0.0001);
    }


}
