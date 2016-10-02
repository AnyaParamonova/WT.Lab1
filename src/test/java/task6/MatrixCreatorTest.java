package task6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class MatrixCreatorTest {
    @Test
    public void test(){
        MatrixCreator creator = new MatrixCreator();
        double[][] realResult = creator.create(1, 2, 3, 4, 5);

        double[][] expectedResult = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };

        for (int i = 0; i < 5; i++){
            assertArrayEquals(realResult[i], expectedResult[i], 0.0001);
        }
    }
}
