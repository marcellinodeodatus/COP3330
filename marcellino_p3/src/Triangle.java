public class Triangle extends Shape2D {
    private final double base;
    private final double height;
    private final String name;


    public Triangle(double base,double height) {
        super();
        this.base = base;
        this.height=height;
        this.name="triangle";
    }


    public double getArea() {
        return (base*height)/2;
    }

    public String getName() {
        return name;
    }


}