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
    public void test1(){
        int[] sequence = {1, 2, 3, 4, 5, 6};
        String failMessage = "fail on sequence: "+ Arrays.toString(sequence);
        assertEquals(failMessage, searcher.countElementsToRemove(sequence), 0);
    }

    @Test
    public void test2(){
        int[] sequence = {1, 2, 3, 1, 4, 5, 6};
        String failMessage = "fail on sequence: "+ Arrays.toString(sequence);
        assertEquals(failMessage, searcher.countElementsToRemove(sequence), 1);
    }

    @Test
    public void test3(){
        int[] sequence = {5, 6, 5, 4, 3, 2, 1};
        String failMessage = "fail on sequence: "+ Arrays.toString(sequence);
        assertEquals(failMessage, searcher.countElementsToRemove(sequence), 5);
    }

    @Test
    public void test4(){
        int[] sequence = new int[0];
        String failMessage = "fail on sequence: "+ Arrays.toString(sequence);
        assertEquals(failMessage, searcher.countElementsToRemove(sequence), 0);

    }

}
