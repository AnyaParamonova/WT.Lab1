package task9;

import java.awt.*;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class Ball {

    private final Color color;
    private final double weight;

    public Ball(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public final Color getColor(){
        return color;
    }

    public final double getWeight(){
        return weight;
    }
}
