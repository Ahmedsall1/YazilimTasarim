package solid.Open_Close;

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double get_area() {
        return (Math.pow(radius,2)*Math.PI);
    }


}
