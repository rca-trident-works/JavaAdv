import java.util.ArrayList;
public class CollectionExample3 {
    public static void main(String[] args) {
        ArrayList<Point> pointList = new ArrayList<Point>();

        pointList.add(new Point(0, 8));
        pointList.add(new Point(1, 6));
        pointList.add(new Point(2, 9));
        pointList.add(new Point(3, 3));

        pointList.sort((p1, p2) -> (p1.x + p1.y) - (p2.x + p2.y));

        pointList.forEach(p -> p.printInfo());
    }
}
