package task9;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class Basket {

    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private double weight;

    public void putBall(Ball ball){
        if(ball != null){
            balls.add(ball);
            weight += ball.getWeight();
        }
    }

    public double getWeight(){
        return weight;
    }

    public int getBallsCount(Color color){
        int count = 0;
        for (Ball ball : balls){
            Color ballColor = ball.getColor();
            if (ballColor.equals(color)){
                count++;
            }
        }
        return count;
    }
}
