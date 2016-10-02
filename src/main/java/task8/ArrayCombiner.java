package task8;

import java.util.Arrays;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class ArrayCombiner {

    public int[] getInsertPositions(double[] src, double[] dest){
        int[] positions = new int[src.length];

        for(int i = 0; i < src.length; i++){
            int insertIndex = Arrays.binarySearch(dest, src[i]);
            if(insertIndex >= 0){
                positions[i] = insertIndex + 1;
            } else{
                positions[i] = -(insertIndex) - 1;
            }
        }

        return positions;
    }
}
