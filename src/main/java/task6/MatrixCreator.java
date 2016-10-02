package task6;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class MatrixCreator {
    public double[][] create(double... array){
        int n = array.length;
        double[][] matrix = new double[n][n];

        for(int i = 0; i < n; i++){
            System.arraycopy(array, 0, matrix[i], 0, n);
            shiftArray(array);
        }

        return matrix;
    }

    private void shiftArray(double[] array){
        double firstElement = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = firstElement;
    }
}
