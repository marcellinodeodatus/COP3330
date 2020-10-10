public class Circle implements Shape, Shape2D {
    private double side;
    private String name;


    public Circle(double side) {
        super();
        this.side = side;
        this.name="circle";
    }


    public double getArea() {
        return side*side;
    }

    public String getName() {
        return name;
    }


}