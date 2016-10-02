package task5;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class LisSearcher {

    public int countElementsToRemove(int... sequence){
        int[] lengthOfIncreasingSequences = countLengthOfIncreasingSequences(sequence);
        int maxLengthOfIncreasingSequence = getMaxValue(lengthOfIncreasingSequences);

        return sequence.length - maxLengthOfIncreasingSequence;
    }

    private int[] countLengthOfIncreasingSequences(int[] sequence){
        int[] lengthOfSequences = initializeArray(sequence.length, 1);

        for (int i = 1; i < sequence.length; i++){
            for (int j = 0; j < i; j++){
                if (sequence[i] > sequence[j] && lengthOfSequences[i] < lengthOfSequences[j] + 1) {
                    lengthOfSequences[i] = lengthOfSequences[j] + 1;
                }
            }
        }

        return lengthOfSequences;
    }

    private int getMaxValue(int[] sequence){
        int maxValue = 0;
        for (int i : sequence){
            if (i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }

    private int[] initializeArray(int length, int initNumber){
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            array[i] = initNumber;
        }
        return array;
    }
}
