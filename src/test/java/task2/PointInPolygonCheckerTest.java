package task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.TestCase.assertEquals;


/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

@RunWith(Parameterized.class)
public class PointInPolygonCheckerTest {

    private static PointInPolygonChecker checker = new PointInPolygonChecker();
    private int x, y;
    private boolean result;

    public PointInPolygonCheckerTest(int x, int y, boolean result){
        this.x = x;
        this.y = y;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        Object[][] data = {
                {0, 0, true},
                {3, 3, true},
                {6, 0, true},
                {-4, 0, true},
                {0, -3, true},
                {-5, -5, false},
                {10, 10, false}
        };

        return Arrays.asList(data);
    }

    @Test
    public void test() {
        String failMessage = "failed on x = " + x + " y = "+ y;
        assertEquals(failMessage, checker.check(x, y), result);
    }

}