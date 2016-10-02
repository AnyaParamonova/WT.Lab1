package task2;

import task2.polygon.Point;
import task2.polygon.Polygon;

/**
 * Created by Anastasia_Paramonova on 17.09.2016.
 * Для данной области составить программу, которая печатает true, если точка с координатами (х,у) принадлежит закрашенной области,
 * и false в противном случае.
 * Будем считать, что точка, лежащая на границе, принадлежит многоугольнику.
 */
public class PointInPolygonChecker {

    private Polygon polygon;

    public PointInPolygonChecker(){
        polygon = new Polygon(
                new Point(4,5), new Point(4,0), new Point(6,0),
                new Point(6,-3), new Point(-6, -3), new Point(-6, 0),
                new Point(-4, 0), new Point(-4, 5)
        );
    }

    public boolean check(int x, int y){
        Point c  = new Point(x, y);
        int result = 1;
        int n = polygon.getTopsNumber();
        for(int i = 0; i < n - 1; i++){
            Point a = polygon.getTop(i);
            Point b = polygon.getTop(i+1);
            result *= rayCrossesAB(a, b, c);
        }
        if(result <= 0){
            return true;
        }
        return false;
    }

    /*
        Проверяет, что луч, выпущенный из точки C вдоль оси Ox в направлении увеличения x, пересекает отрезок AB
        Возвращаемые значения:
        1 - не пересекает
        -1 - пересекает
        0 - точка принадлежит отрезку
    */
    private int rayCrossesAB(Point a, Point b, Point c){
        int ax = a.getX() - c.getX();
        int ay = a.getY() - c.getY();
        int bx = b.getX() - c.getX();
        int by = b.getY() - c.getY();

        if(ay*by > 0){
            return 1;
        }

        int signum = Long.signum(ax*by - ay*bx);
        if(signum == 0){
            if(ax*bx <= 0){
                return 0;
            }
            return 1;
        }
        if(ay < 0){
            return -signum;
        }
        if(by < 0){
            return signum;
        }

        return 1;
    }
}
