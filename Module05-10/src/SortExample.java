import java.util.ArrayList;
class Point implements Comparable<Point> {
    int x;
    int y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p) {
        return (this.x + this.y) - (p.x + p.y);
    }

}

public class SortExample {
    public static void main(String[] args) {

    }
}
