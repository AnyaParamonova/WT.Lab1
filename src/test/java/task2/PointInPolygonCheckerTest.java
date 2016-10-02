package task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

@RunWith(Parameterized.class)
public class PointInPolygonCheckerTest {

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
                {10, 10, false},
                {5, 3, false}
        };

        return Arrays.asList(data);
    }

    @Test
    public void test() {
        PointInPolygonChecker checker = new PointInPolygonChecker();
        assertEquals(checker.check(x, y), result);
    }

}