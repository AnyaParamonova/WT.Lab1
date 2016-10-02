package task4;

import java.util.ArrayList;
import static java.lang.Math.sqrt;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */
public class PrimeNumberSearcher {
    public int[] search(int... numbers){
        ArrayList<Integer> primeNumbersIndexes = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                primeNumbersIndexes.add(i);
            }
        }
        int[] result = new int[primeNumbersIndexes.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = primeNumbersIndexes.get(i);
        }
        return result;
    }

    private boolean isPrime(int number){
        for(int i = 2; i <= sqrt(number); i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
