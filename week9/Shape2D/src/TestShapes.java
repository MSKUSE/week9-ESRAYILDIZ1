import "package:week9-main/abstract/Shape.java"
public class TestShapes {
    public static void main(String[] args) {

        Shape square = new Shape ("blue");


        Rectangle square = new Rectangle();
        square.describe();

        Rectangle r1 = new Rectangle("blue",3,4) ;
        Rectangle r2 = new Rectangle(3,4);
        System.out.println(r1.equals(r2));

        Shape shape = new Shape("red");
        System.out.println(shape);
        System.out.println("Area: "+shape.area());
        System.out.println("Perimeter: "+shape.perimeter());
        System.out.println("----------------------------------");

        Circle circle = new Circle ("blue",5);
    }
}