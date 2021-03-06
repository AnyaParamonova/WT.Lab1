package task3;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class TgCalculatorTest {

    private TgCalculator calculator = new TgCalculator();
    private double[][] expectedResult = {
            {-3.0, 0.1425},
            {-2.0, 2.1850},
            {-1.0, -1.5574},
            {0.0, 0.0},
            {1.0, 1.5574},
            {2.0, -2.1850},
            {3.0, -0.1425}

    };
    private double[][] expectedResult1 = {
            {3.0, -0.1425},
            {2.0, -2.1850},
            {1.0, 1.5574},
            {0.0, 0.0},
            {-1.0, -1.5574},
            {-2.0, 2.1850},
            {-3.0, 0.1425}
    };

    @Test
    public void test1() {
        test(-3, 3.9, 1, expectedResult);
    }

    @Test
    public void test2(){
        test(3.9, -3, 1, expectedResult);
    }

    @Test
    public void test3(){
        test(-3.9, 3, -1, expectedResult1);
    }
    @Test
    public void test4(){
        test(3, -3.9, -1, expectedResult1);
    }
    @Test
    public void test5(){
        assertNull("failed on h = 0 ",calculator.calculate(3, 1, 0));
    }

    private void test(double a, double b, double h, double[][] expectedResult){
        String failString = "failed on a = " + a + " b = "+ b + " h = " + h;
        double[][] realResult = calculator.calculate(a, b, h);
        for (int i = 0; i < realResult.length; i++) {
            assertArrayEquals(failString, realResult[i], expectedResult[i], 0.0001);
        }
    }

}
