import java.util.Objects;

public class Rectangle extends Shape{
    private int sideA=0, sideB=0;

    public void Rectangle(){

    }
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void describe(){
        System.out.println("This is a shape and color is "+this.color);
    }
    public void describe(){
        super.describe();

    }
    public void describe(){
        super.describe();
        System.out.println("side A is "+this.sideA+ " side B is "+this.sideB);
    }
    /*
    public void describe(int sideA, int sideB){
        System.out.println("Side A is "+ sideA+" Side B is "+sideB);
    }
    public void describe(int sideA){
        System.out.println("Side A is "+ sideA);
    }
    public void describe(double sideA){
        System.out.println("Radius is "+ sideA);  //overloading
    }*/

    @Override
        public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;


        if(this.sideA == r.sideA &&this.sideB==r.sideB && Objects.equals(this.getColor(), r.getColor())) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

}
