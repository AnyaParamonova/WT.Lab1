package task3;

import static java.lang.Math.abs;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class TgCalculator {
    public double[][] calculate(double a, double b, double h){

        if(h == 0.0){
            return null;
        }

        if(b < a){
            double c = b;
            b = a;
            a = c;
        }

        if(h > 0){
            return tgWithPositiveStep(a, b, h);
        } else{
            return tgWithNegativeStep(b, a, h);
        }
    }

    private double[][] tgWithPositiveStep(double a, double b, double h){
        int length = calculateArrayLength(a, b, h);
        double[][] result = new double[length][2];

        int i = 0;
        for(double value = a; value <= b; value += h, i++){
            result[i][0] = value;
            result[i][1] = Math.tan(value);
        }

        return result;
    }

    private double[][] tgWithNegativeStep(double a, double b, double h){
        int length = calculateArrayLength(a, b, h);
        double[][] result = new double[length][2];

        int i = 0;
        for(double value = a; value >= b; value += h, i++){
            result[i][0] = value;
            result[i][1] = Math.tan(value);
        }
        return result;
    }

    private int calculateArrayLength(double a, double b, double h){
        return  (int)abs(((b - a)/h))+1;
    }
}
