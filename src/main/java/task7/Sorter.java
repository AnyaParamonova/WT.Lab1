package task7;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class Sorter {
    public double[] sort(double... array){

        double[] arrayToSort = copyArray(array);

        int boundary = 0;
        while (boundary < arrayToSort.length - 1){
            if(arrayToSort[boundary] <= arrayToSort[boundary+1]){
                boundary++;
            }else{
                swapElements(arrayToSort, boundary, boundary + 1);
                if(boundary > 0) {
                    boundary--;
                }
            }
        }

        return arrayToSort;
    }

    private double[] copyArray(double[] src){
        double[] dest = new double[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);

        return dest;
    }

    private void swapElements(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
