import java.text.DecimalFormat;

public class Sphere extends Shape3D {

    private final double radius;
    private final String name;



    public Sphere(double radius) {
        super();
        this.radius = radius;
        this.name="sphere";
    }

    @Override
    public double getVolume() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format((1.333333333333)*(Math.PI)*(radius*radius*radius)));
    }

    @Override
    public double getArea() {
        DecimalFormat df = new DecimalFormat("####0.00");
        return Double.parseDouble(df.format(4*Math.PI*radius*radius));
    }

    public String getName() {
        return name;
    }


}