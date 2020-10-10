public class Square extends Shape2D {
    private final double side;
    private final String name;


    public Square(double side) {
        super();
        this.side = side;
        this.name="square";
    }

    public double getArea() {
        return side*side;
    }

    public String getName() {
        return name;
    }
}
