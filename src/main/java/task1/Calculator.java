package task1;

import static java.lang.Math.sin;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

/**
 * Created by Anastasia_Paramonova on 13.09.2016.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */
public class Calculator {
    public double calculate(double x, double y) throws ArithmeticException {
        return countNumerator(x, y) / countDenominator(x, y) + x;
    }

    private double countNumerator(double x, double y) {
        return (1 + sqr(sin(x + y)));
    }

    private double countDenominator(double x, double y) throws ArithmeticException {
        return 2 + abs(x - 2 * x / (1 + sqr(x * y)));
    }

    private double sqr(double a) {
        return pow(a, 2);
    }
}

