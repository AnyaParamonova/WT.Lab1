package task2.polygon;

/**
 * Created by Anastasia_Paramonova on 17.09.2016.
 */

public class Polygon {
    private Point[] tops;

    public Polygon(Point... polygonVertices){
        this.tops = polygonVertices;
    }

    public int getTopsNumber(){
        return tops.length;
    }
    public Point getTop(int topNumber){
        return tops[topNumber];
    }
}
