package task8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class ArrayCombinerTest {

    @Test
    public void test(){
        ArrayCombiner combiner = new ArrayCombiner();

        int[] expectedResult = {1, 2, 3, 4};
        int[] realResult = combiner.getInsertPositions(new double[]{2, 4, 6, 8},new double[]{1, 3, 5, 7});
        assertArrayEquals("failed test 1 ", expectedResult, realResult);

        expectedResult = new int[]{4, 4, 4, 4};
        realResult = combiner.getInsertPositions(new double[]{5, 6, 7, 8}, new double[]{1, 2, 3, 4});
        assertArrayEquals("failed test 2 ", expectedResult, realResult);

        expectedResult = new int[]{0, 0, 0, 0};
        realResult = combiner.getInsertPositions(new double[]{1, 2, 3, 4}, new double[]{5, 6, 7, 8});
        assertArrayEquals("failed test 3 ", expectedResult, realResult);

        expectedResult = new int[]{1, 2, 3, 4};
        realResult = combiner.getInsertPositions(new double[]{1, 2, 3, 4}, new double[]{1, 2, 3, 4});
        assertArrayEquals("failed test 4 ", expectedResult, realResult);
    }

}
