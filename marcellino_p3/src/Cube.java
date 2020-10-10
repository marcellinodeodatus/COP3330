public class Cube extends Shape3D {
    private final double side;
    private final String name;


    public Cube(double side) {
        super();
        this.side = side;
        this.name="cube";
    }


    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public double getArea() {
        return side*side*6;
    }

    public String getName() {
        return name;
    }


}