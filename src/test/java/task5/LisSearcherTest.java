package task5;

import org.junit.Test;
import java.util.Arrays;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class LisSearcherTest {
    private LisSearcher searcher = new LisSearcher();

    @Test
    public void test(){
        testOnSequence(0, 1, 2, 3, 4, 5, 6);
        testOnSequence(1, 1, 2, 3, 1, 4, 5, 6);
        testOnSequence(5, 6, 5, 4, 3, 2, 1);
        testOnSequence(0);
    }

    private void testOnSequence(int expectedResult, int... sequence){
        String failMessage = "fail on sequence: "+ Arrays.toString(sequence);
        assertEquals(failMessage, searcher.countElementsToRemove(sequence), expectedResult);
    }


}
