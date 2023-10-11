package ReviewObj;

interface Shape {
    double getArea();
}

class Rect implements Shape {
    double width;
    double height;

    Rect(double width, double height) {
        System.out.print("□: ");
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        System.out.print("○: ");
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

class Triangle implements Shape {
    double width;
    double height;

    Triangle(double width, double height) {
        System.out.print("△: ");
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height / 2;
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Shape s1 = new Rect(10.3, 5.2);
        showArea(s1);

        Shape s2 = new Circle(3.0);
        showArea(s2);

        Shape s3 = new Triangle(10.0, 7.5);
        showArea(s3);
    }

    static void showArea(Shape shape) {
        System.out.println(shape.getArea());
    }
}
