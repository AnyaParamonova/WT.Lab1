package task1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Anastasia_Paramonova on 17.09.2016.
 */

@RunWith(Parameterized.class)
public class CalculatorTest {

    private double x, y, result;

    public CalculatorTest(double x, double y, double result){
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Double[]> testData(){
        Double[][] data = {
                {0.0 ,0.0, 0.5},
                {1.0, 0.0, 1.569358},
                {0.0, 1.0, 0.854037},
                {1.0, 1.0, 1.913411},
                {-1.0, -1.0, -0.086589},
        };

        return Arrays.asList(data);
    }

    @Test
    public void test() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate(x, y), result, 0.000001);
    }
}

