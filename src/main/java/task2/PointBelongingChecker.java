package task2;

/**
 * Created by Anastasia_Paramonova on 17.09.2016.
 * Для данной области составить программу, которая печатает true, если точка с координатами (х,у) принадлежит закрашенной области,
 * и false в противном случае.
 */
public class PointBelongingChecker {

    private Polynom polynom;

    public PointBelongingChecker(){
        polynom = new Polynom(
                new Point(4,5), new Point(4,0), new Point(6,0),
                new Point(6,-3), new Point(-6, -3), new Point(-6, 0),
                new Point(-4, 0), new Point(-4, 5)
        );
    }

    public boolean check(double x, double y){
        return false;
    }
}
