public class Circle extends Shape2D {
    private final double radius;
    private final String name;


    public Circle(double radius) {
        super();
        this.radius = radius;
        this.name="circle";
    }


    @Override
    public double getArea() {
        double pi = 3.14;
        return pi*radius*radius ;
    }

    @Override
    public String getName() {
        return name;
    }
}