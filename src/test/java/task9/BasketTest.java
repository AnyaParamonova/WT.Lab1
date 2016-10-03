package task9;

import org.junit.Test;
import java.awt.*;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Anastasia_Paramonova on 02.10.2016.
 */

public class BasketTest {

    @Test
    public void test1(){
        Basket basket = new Basket();
        basket.putBall(new Ball(Color.BLUE, 0.5));
        basket.putBall(new Ball(Color.GREEN, 0.3));
        basket.putBall(new Ball(Color.BLACK, 0.8));
        basket.putBall(new Ball(Color.BLUE, 0.5));
        basket.putBall(new Ball(Color.BLUE, 0.1));

        assertEquals(basket.getWeight(), 2.2);
    }

    @Test
    public void test2(){
        Basket basket = new Basket();
        basket.putBall(new Ball(Color.BLUE, 0.5));
        basket.putBall(new Ball(Color.GREEN, 0.3));
        basket.putBall(new Ball(Color.BLACK, 0.8));
        basket.putBall(new Ball(Color.BLUE, 0.5));
        basket.putBall(new Ball(Color.BLUE, 0.1));

        assertEquals(basket.getBallsCount(Color.BLUE), 3);
    }

}
