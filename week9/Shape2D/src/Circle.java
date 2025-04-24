public class Circle extends Shape{
    private int radius;

    public Circle(){super();}

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius(){return radius;}

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double area(){return Math.PI*radius*radius}

}
